package main

import "fmt"

func main() {
	var numbers [6]int
	var sumEven int
	var countOdd int
	fmt.Println("Digite 6 numeros inteiros:")
	// Receber os numeros do usuario
	for i := 0; i < 6; i++ {
		fmt.Scan(&numbers[i])
	}
	fmt.Print("Numeros pares digitados: ")
	for _, num := range numbers {
		if num%2 == 0 {
			fmt.Print(num, " ")
			sumEven += num
		}
	}
	fmt.Println()

	fmt.Println("Soma dos numeros pares:", sumEven)

	fmt.Print("Numeros impares digitados: ")
	for _, num := range numbers {
		if num%2 != 0 {
			fmt.Print(num, " ")
			countOdd++
		}
	}
	fmt.Print("\nQuantidade de numeros impares: ", countOdd)

}
