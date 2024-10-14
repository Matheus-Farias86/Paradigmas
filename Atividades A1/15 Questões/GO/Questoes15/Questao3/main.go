package main

//3. Encapsulamento Implemente uma classe ContaBancaria com atributos saldo, titular e métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo.
import "fmt"

type ContaBancaria struct {
	titular string
	saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
	} else {
		fmt.Println("Valor deve ser maior que 0")
	}
}

func (c *ContaBancaria) Sacar(valor float64) {
	if valor > 0 && valor <= c.saldo {
		c.saldo -= valor
	} else if valor > c.saldo {
		fmt.Println("Saldo insuficiente")
	} else {
		fmt.Println("Valor deve ser maior que 0")
	}
}

func (c *ContaBancaria) GetSaldo() float64 {
	return c.saldo
}

func (c ContaBancaria) Exibir() {
	fmt.Printf("Titular: %s, Saldo: %.2f\n", c.titular, c.saldo)
}

func main() {
	conta := ContaBancaria{titular: "Tyler", saldo: 4000}

	conta.Exibir()

	conta.Depositar(700)
	conta.Exibir()

	conta.Sacar(3000)
	conta.Exibir()

	conta.Sacar(5000)
	conta.Exibir()
}
