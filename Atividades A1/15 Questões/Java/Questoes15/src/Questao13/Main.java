package Questao13;
//13. Métodos Estáticos Adicione um método estático à classe Matematica que calcula o fatorial de um número. Em Python, utilize @staticmethod, em Java static,
//e em Golang crie uma função regular na struct.

class Matematica {
    public static int calcFatorial(int numero) {
        if (numero == 0 || numero == 1) return 1;
        int fatorial = 1;
        for (int i = 2; i <= numero; i++) fatorial *= i;

        return fatorial;
    }
}

public class Main {
    public static void main(String[] args) {
        // Testando o método calcularFatorial
        int numero = 5;
        int resultado = Matematica.calcFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }
}
