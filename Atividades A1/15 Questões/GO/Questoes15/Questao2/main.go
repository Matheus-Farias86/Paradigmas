package main

//2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.
import "fmt"

type Carro struct {
	Marca      string
	Modelo     string
	Ano        int
	Velocidade int
}

func (c *Carro) Acelerar(incremento int) {
	c.Velocidade += incremento
}

func (c *Carro) Frear(decremento int) {
	c.Velocidade -= decremento
	if c.Velocidade < 0 {
		c.Velocidade = 0
	}
}

func (c Carro) Exibir() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d\n", c.Marca, c.Modelo, c.Ano)
}

func (c Carro) ExibirVelocidade() {
	fmt.Printf("Velocidade atual: %d\n", c.Velocidade)
}

func main() {
	carro1 := Carro{Marca: "Toyota", Modelo: "Corolla", Ano: 2021, Velocidade: 0}

	carro1.Exibir()
	carro1.ExibirVelocidade()
	carro1.Acelerar(40)
	carro1.ExibirVelocidade()
	carro1.Frear(10)
	carro1.ExibirVelocidade()
	carro1.Frear(100)
	carro1.ExibirVelocidade()
}
