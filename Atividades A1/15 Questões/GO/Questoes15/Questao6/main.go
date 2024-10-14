package main

//6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.
import "fmt"

type Motor struct {
	tipo     string
	potencia int
}

func (m Motor) Ligar() {
	fmt.Println("O motor está ligado.")
}

func (m Motor) Desligar() {
	fmt.Println("O motor está desligado.")
}

type Carro struct {
	marca  string
	modelo string
	ano    int
	motor  Motor
}

func (c Carro) Ligar() {
	c.motor.Ligar()
	fmt.Println("O carro está pronto para rodar.")
}

func (c Carro) Desligar() {
	c.motor.Desligar()
	fmt.Println("O carro está desligado.")
}

func (c Carro) Exibir() {
	fmt.Printf("Marca: %s, Modelo: %s, Ano: %d\n", c.marca, c.modelo, c.ano)
}

func main() {
	carro1 := Carro{"Toyota", "Corolla", 2021, Motor{"Diesel", 150}}
	carro2 := Carro{"Jeep", "Commander", 2024, Motor{"Gasolina", 180}}
	carro3 := Carro{"Ford", "Maverick", 2022, Motor{"Diesel", 200}}

	carro1.Exibir()
	carro2.Exibir()
	carro3.Exibir()

	carro1.Ligar()
	carro1.Desligar()
}
