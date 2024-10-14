package Questao3;
//3. Encapsulamento Implemente uma classe ContaBancaria com atributos saldo, titular e métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo.

// Classe ContaBancaria
class ContaBancaria {
    private double saldo;    // Atributo encapsulado
    private String titular;  // Nome do titular da conta

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        else System.out.println("O valor deve ser positivo.");

    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
        else if (valor > saldo) System.out.println("Saldo insuficiente.");
        else System.out.println("O valor deve ser positivo.");

    }

    public double getSaldo() {
        return saldo;
    }

    public void exibir() {
        System.out.println("Titular: " + titular + ", Saldo: R$" + saldo);
    }
}

// Cliente
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Tyler", 4000.00);

        conta.exibir();

        conta.depositar(700.00);
        conta.exibir();

        conta.sacar(3000.00);
        conta.exibir();

        conta.sacar(10000.00);
        conta.exibir();
    }
}

