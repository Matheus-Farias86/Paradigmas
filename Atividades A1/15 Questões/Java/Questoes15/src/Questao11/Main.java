package Questao11;
//11. Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHorista e FuncionarioAssalariado
//que implementam calcularSalario de formas distintas.

// Classe abstrata Funcionario
abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract double calcularSalario();
}

// Classe FuncionarioHorista que estende Funcionario
class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
}

// Classe FuncionarioAssalariado que estende Funcionario
class FuncionarioAssalariado extends Funcionario {
    private double salarioFixo;

    public FuncionarioAssalariado(String nome, double salarioFixo) {
        super(nome);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo;
    }
}

// Classe Main para testar o código
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de FuncionarioHorista e FuncionarioAssalariado
        Funcionario horista = new FuncionarioHorista("João", 160, 25.0); // 160 horas trabalhadas a R$25/hora
        Funcionario assalariado = new FuncionarioAssalariado("Maria", 3000.0); // Salário fixo de R$3000

        // Exibindo os salários
        System.out.println("Salário do horista " + horista.nome + ": R$" + horista.calcularSalario());
        System.out.println("Salário do assalariado " + assalariado.nome + ": R$" + assalariado.calcularSalario());
    }
}

