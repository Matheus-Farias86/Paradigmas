package Questao8;
//8. Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario.

import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }
}

class Empresa {
    private String nomeEmpresa;
    private List<Empregado> empregados;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.empregados = new ArrayList<>();
    }

    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public void exibirEmpregados() {
        System.out.println("Lista de empregados da empresa " + nomeEmpresa + ":");
        for (Empregado empregado : empregados) empregado.exibirDetalhes();
    }
}

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Dunder Mifflin");

        Empregado emp1 = new Empregado("Jim", "Vendedor", 4200.00);
        Empregado emp2 = new Empregado("Pam", "Recepcionista", 2500.00);
        Empregado emp3 = new Empregado("Michael", "Gerente", 7000.00);

        empresa.addEmpregado(emp1);
        empresa.addEmpregado(emp2);
        empresa.addEmpregado(emp3);

        empresa.exibirEmpregados();
    }
}
