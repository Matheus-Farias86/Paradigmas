package main

//11. Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHorista e FuncionarioAssalariado
//que implementam calcularSalario de formas distintas.
import "fmt"

type Funcionario interface {
	calcularSalario() float64
}

type FuncionarioHorista struct {
	nome             string
	horasTrabalhadas int
	valorPorHora     float64
}

func (f FuncionarioHorista) calcularSalario() float64 {
	return float64(f.horasTrabalhadas) * f.valorPorHora
}

type FuncionarioAssalariado struct {
	nome        string
	salarioFixo float64
}

func (f FuncionarioAssalariado) calcularSalario() float64 {
	return f.salarioFixo
}

func main() {
	horista := FuncionarioHorista{"João", 160, 25.0}
	assalariado := FuncionarioAssalariado{"Maria", 3000.0}

	fmt.Printf("Salário do horista %s: %.2f\n", horista.nome, horista.calcularSalario())
	fmt.Printf("Salário do assalariado %s: %.2f\n", assalariado.nome, assalariado.calcularSalario())
}
