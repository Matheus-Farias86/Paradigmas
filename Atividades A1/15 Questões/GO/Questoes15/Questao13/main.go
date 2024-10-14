package main

//13. Métodos Estáticos Adicione um método estático à classe Matematica que calcula o fatorial de um número. Em Python, utilize @staticmethod, em Java static,
//e em Golang crie uma função regular na struct.
import "fmt"

func CalcFatorial(numero int) int {
	if numero == 0 || numero == 1 {
		return 1
	}
	fatorial := 1
	for i := 2; i <= numero; i++ {
		fatorial *= i
	}
	return fatorial
}

func main() {
	numero := 5
	resultado := CalcFatorial(numero)
	fmt.Printf("Fatorial de %d = %d\n", numero, resultado)
}
