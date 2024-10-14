package main

//8. Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario.
import "fmt"

type Empregado struct {
	nome    string
	cargo   string
	salario float64
}

func (e *Empregado) ExibirDetalhes() {
	fmt.Printf("Nome: %s, Cargo: %s, Salário: %.2f\n", e.nome, e.cargo, e.salario)
}

type Empresa struct {
	nomeEmpresa string
	empregados  []*Empregado
}

func (emp *Empresa) AddEmpregado(e *Empregado) {
	emp.empregados = append(emp.empregados, e)
}

func (emp *Empresa) ExibirEmpregados() {
	for _, empregado := range emp.empregados {
		empregado.ExibirDetalhes()
	}
}

func main() {
	empresa := &Empresa{nomeEmpresa: "Dunder Mifflin"}

	emp1 := &Empregado{nome: "Jim", cargo: "Vendedor", salario: 4200.00}
	emp2 := &Empregado{nome: "Pam", cargo: "Recepcionista", salario: 2500.00}
	emp3 := &Empregado{nome: "Michael", cargo: "Gerente", salario: 7000.00}

	empresa.AddEmpregado(emp1)
	empresa.AddEmpregado(emp2)
	empresa.AddEmpregado(emp3)

	empresa.ExibirEmpregados()
}
