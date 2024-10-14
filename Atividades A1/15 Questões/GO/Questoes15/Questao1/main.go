package main

//1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.
import "fmt"

type Carro struct {
	Marca  string
	Modelo string
	Ano    int
}

func (c Carro) Exibir() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d\n", c.Marca, c.Modelo, c.Ano)
}

func main() {
	carro1 := Carro{Marca: "Toyota", Modelo: "Corolla", Ano: 2021}
	carro2 := Carro{Marca: "Jeep", Modelo: "Commander", Ano: 2024}
	carro3 := Carro{Marca: "Ford", Modelo: "Maverick", Ano: 2022}

	carro1.Exibir()
	carro2.Exibir()
	carro3.Exibir()
}
