package main

//7. Associação Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.
import "fmt"

type Professor struct {
	nome    string
	escolas []*Escola
}

func (p *Professor) AddEscola(e *Escola) {
	p.escolas = append(p.escolas, e)
	e.AddProfessor(p)
}

func (p *Professor) GetEscolas() []*Escola {
	return p.escolas
}

type Escola struct {
	nome        string
	professores []*Professor
}

func (e *Escola) AddProfessor(p *Professor) {
	for _, professor := range e.professores {
		if professor == p {
			return
		}
	}
	e.professores = append(e.professores, p)
}

func (e *Escola) GetProfessores() []*Professor {
	return e.professores
}

func main() {
	prof1 := &Professor{nome: "Kate"}
	prof2 := &Professor{nome: "Jack"}
	prof3 := &Professor{nome: "John"}

	escola1 := &Escola{nome: "Ilha"}
	escola2 := &Escola{nome: "Dharma"}

	prof1.AddEscola(escola1)
	prof2.AddEscola(escola1)
	prof2.AddEscola(escola2)
	prof3.AddEscola(escola2)

	fmt.Println("Escolas da Kate:")
	for _, escola := range prof1.GetEscolas() {
		fmt.Println("   -", escola.nome)
	}

	fmt.Println("Escolas do Jack:")
	for _, escola := range prof2.GetEscolas() {
		fmt.Println("   -", escola.nome)
	}

	fmt.Println("Escolas do John:")
	for _, escola := range prof3.GetEscolas() {
		fmt.Println("   -", escola.nome)
	}

	fmt.Println("Professores da escola Ilha:")
	for _, professor := range escola1.GetProfessores() {
		fmt.Println("   -", professor.nome)
	}

	fmt.Println("Professores da escola Dharma:")
	for _, professor := range escola2.GetProfessores() {
		fmt.Println("   -", professor.nome)
	}
}
