package main

//10. Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go) Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números).
//Em Golang, use funções com nomes diferentes para diferentes quantidades de parâmetros.
import "fmt"

func somarDois(a int, b int) int {
	return a + b
}

func somarTres(a int, b int, c int) int {
	return a + b + c
}

func main() {
	x1 := somarDois(14, 11)
	fmt.Println("14 + 11 =", x1)

	x2 := somarTres(10, 5, 90)
	fmt.Println("10 + 5 + 90 =", x2)
}
