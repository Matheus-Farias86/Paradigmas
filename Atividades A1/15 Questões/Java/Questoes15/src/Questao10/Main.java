package Questao10;
//10. Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go) Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números).
//Em Golang, use funções com nomes diferentes para diferentes quantidades de parâmetros.

class Calculadora {

    // Método para somar dois números
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar três números
    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Chamadas aos métodos da calculadora
        int x1 = calculadora.somar(14, 11);
        System.out.println("14 + 11 = " + x1);

        int x2 = calculadora.somar(10, 5, 90);
        System.out.println("10 + 5 + 90 = " + x2);
    }
}