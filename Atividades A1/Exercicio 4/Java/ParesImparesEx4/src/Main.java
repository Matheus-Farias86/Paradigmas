// Faça um programa em Java que receba 6 numeros inteiros e mostre
// - Os numeros pares digitados;
// - A soma dos numeros pares digitados;
// - Os numeros impares digitados;
// - A quantidade de numeros impares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[6];
        int sumEven = 0;
        int countOdd = 0;

        System.out.println("Digite 6 numeros inteiros: ");

        // Receba os numeros do usuário
        for(int i = 0;i < 6;i++) numbers[i] = scanner.nextInt();

        System.out.println("Numeros pares digitados: ");

        for(int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
                sumEven += num;
            }
        }
        System.out.println("Soma dos valores pares: "+ sumEven);
        System.out.println("Numeros impares digitados: ");
        for(int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num + " ");
                countOdd += 1;
            }
        }
        System.out.println("Quantidade de numeros impares: " + countOdd);
    }
}