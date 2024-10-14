package main

import "fmt"

func main() {
	// Declarando vetores
	var vetorA, vetorB, vetorC [10]int

	// Recebendo os dados do vetor A
	fmt.Println("Digite os elementos do vetor A:")
	for i := 0; i < 10; i++ {
		fmt.Printf("Elemento %d do vetor A: ", i)
		fmt.Scan(&vetorA[i])
	}

	// Recebendo os dados do vetor B
	fmt.Println("Digite os elementos do vetor B:")
	for i := 0; i < 10; i++ {
		fmt.Printf("Elemento %d do vetor B: ", i)
		fmt.Scan(&vetorB[i])
	}

	// Calculando a diferença entre os vetores A e B e armazenando no vetor C
	for i := 0; i < 10; i++ {
		vetorC[i] = vetorA[i] - vetorB[i]
	}

	// Exibindo os valores do vetor C
	fmt.Println("Vetor C (A - B):")
	for i := 0; i < 10; i++ {
		fmt.Printf("Elemento %d do vetor C: %d\n", i, vetorC[i])
	}
}
