package main

//4. Herança Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que implementam o método som de maneiras diferentes.
import "fmt"

type Animal struct {
	especie string
	nome    string
}

func (a Animal) EmitirSom() string {
	return ""
}

type Cachorro struct {
	Animal
}

func NovoCachorro(nome string) Cachorro {
	return Cachorro{
		Animal: Animal{
			especie: "cachorro",
			nome:    nome,
		},
	}
}

func (c Cachorro) EmitirSom() string {
	return "Au Au"
}

type Gato struct {
	Animal
}

func NovoGato(nome string) Gato {
	return Gato{
		Animal: Animal{
			especie: "gato",
			nome:    nome,
		},
	}
}

func (g Gato) EmitirSom() string {
	return "Miau"
}

func main() {
	cachorro := NovoCachorro("Rex")
	gato := NovoGato("Mimi")

	fmt.Printf("%s diz: %s\n", cachorro.nome, cachorro.EmitirSom())
	fmt.Printf("%s diz: %s\n", gato.nome, gato.EmitirSom())
}
