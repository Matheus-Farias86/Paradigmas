package main

//5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.
import "fmt"

type Animal interface {
	EmitirSom() string
	GetNome() string
}

type Cachorro struct {
	nome string
}

func (c Cachorro) EmitirSom() string {
	return "Au Au"
}

func (c Cachorro) GetNome() string {
	return c.nome
}

type Gato struct {
	nome string
}

func (g Gato) EmitirSom() string {
	return "Miau"
}

func (g Gato) GetNome() string {
	return g.nome
}

func emitirSonsDosAnimais(animais []Animal) {
	for _, animal := range animais {
		fmt.Printf("%s diz: %s\n", animal.GetNome(), animal.EmitirSom())
	}
}

func main() {
	cachorro := Cachorro{"Rex"}
	gato := Gato{"Mimi"}

	animais := []Animal{cachorro, gato}

	emitirSonsDosAnimais(animais)
}
