package main

//15. Exceções/Erros Personalizados Crie uma classe de exceção personalizada SaldoInsuficienteException em Java e Python, ou error em Golang, que seja lançada
//quando houver uma tentativa de saque superior ao saldo disponível na classe ContaBancaria.
import (
	"fmt"
)

type SaldoInsuficienteError struct {
	saldoDisponivel float64
	saque           float64
}

func (e *SaldoInsuficienteError) Error() string {
	return fmt.Sprintf("Saldo insuficiente para realizar o saque. Saldo disponível: %.2f, tentativa de saque: %.2f", e.saldoDisponivel, e.saque)
}

type ContaBancaria struct {
	titular string
	saldo   float64
}

func NovaContaBancaria(titular string, saldoInicial float64) *ContaBancaria {
	return &ContaBancaria{titular: titular, saldo: saldoInicial}
}

func (c *ContaBancaria) GetSaldo() float64 {
	return c.saldo
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.saldo {
		return &SaldoInsuficienteError{saldoDisponivel: c.saldo, saque: valor}
	}
	c.saldo -= valor
	fmt.Printf("Saque realizado: %.2f\n", valor)
	return nil
}

func main() {
	conta := NovaContaBancaria("Jack", 1000.00)
	fmt.Println("Saldo atual:", conta.GetSaldo())

	err := conta.Sacar(500.00)
	if err != nil {
		fmt.Println(err)
	}

	err = conta.Sacar(600.00)
	if err != nil {
		fmt.Println(err)
	}

	fmt.Println("Saldo atual:", conta.GetSaldo())
}
