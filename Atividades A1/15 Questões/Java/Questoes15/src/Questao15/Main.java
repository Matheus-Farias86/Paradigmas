package Questao15;
//15. Exceções/Erros Personalizados Crie uma classe de exceção personalizada SaldoInsuficienteException em Java e Python, ou error em Golang, que seja lançada
//quando houver uma tentativa de saque superior ao saldo disponível na classe ContaBancaria.

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque. Saldo disponível: " + saldo);
        else{
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Jack", 1000.0);
        System.out.println("Saldo atual: " + conta.getSaldo());

        try {
            conta.sacar(500.0);
            conta.sacar(600.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
