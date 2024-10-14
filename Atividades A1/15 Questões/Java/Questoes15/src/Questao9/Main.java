package Questao9;
//9. Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que tenha um método imprimir. Implemente essa interface em classes como Relatório e Contrato. Em Python, use a abordagem de protocolo ou classes abstratas.

public class Main {

    interface Imprimivel {
        void imprimir();
    }

    static class Relatorio implements Imprimivel {
        @Override
        public void imprimir() {
            System.out.println("Imprimindo relatório...");
        }
    }

    static class Contrato implements Imprimivel {
        @Override
        public void imprimir() {
            System.out.println("Imprimindo contrato...");
        }
    }

    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        Contrato contrato = new Contrato();

        relatorio.imprimir();
        contrato.imprimir();
    }
}