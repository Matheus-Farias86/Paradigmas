package main

import "fmt"

// Definindo a estrutura de um retangulo
type Retangulo struct {
	comprimento, largura float64
}

// Funcao para calcular a área do retangulo
func (r Retangulo) calcularArea() float64 {
	return r.comprimento * r.largura
}

// Funcao para calcular o perimetro do retangulo
func (r Retangulo) calcularPerimetro() float64 {
	return 2 * (r.comprimento + r.largura)
}

func main() {
	ret := Retangulo{comprimento: 200, largura: 300}
	fmt.Printf("Area: %.2f\n", ret.calcularArea())
	fmt.Printf("Perimetro: %.2f\n", ret.calcularPerimetro())

}
