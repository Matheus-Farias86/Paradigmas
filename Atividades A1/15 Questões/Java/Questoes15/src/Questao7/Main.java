package Questao7;
//7. Associação Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void addEscola(Escola escola) {
        if (!this.escolas.contains(escola)) {
            this.escolas.add(escola);
            escola.addProfessor(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }
}

class Escola {
    private String nome;
    private List<Professor> prof;

    public Escola(String nome) {
        this.nome = nome;
        this.prof = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProf() {
        return prof;
    }

    public void addProfessor(Professor professor) {
        if (!this.prof.contains(professor)) {
            this.prof.add(professor);
            professor.addEscola(this);
        }
    }
}

// Cliente
public class Main {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Kate");
        Professor prof2 = new Professor("Jack");
        Professor prof3 = new Professor("John");
        Escola escola1 = new Escola("Escola Ilha");
        Escola escola2 = new Escola("Escola Dharma");

        prof1.addEscola(escola1);
        prof2.addEscola(escola1);
        prof2.addEscola(escola2);
        prof3.addEscola(escola2);

        System.out.println("Escolas de Kate:");
        for (Escola escola : prof1.getEscolas()) System.out.println(escola.getNome());
        System.out.println("\nEscolas de Jack:");
        for (Escola escola : prof2.getEscolas()) System.out.println(escola.getNome());
        System.out.println("\nEscolas de Jhon:");
        for (Escola escola : prof3.getEscolas()) System.out.println(escola.getNome());

        System.out.println("\nProfessores na " + escola1.getNome() + ":");
        for (Professor professor : escola1.getProf()) System.out.println(professor.getNome());
        System.out.println("\nProfessores na " + escola2.getNome() + ":");
        for (Professor professor : escola2.getProf()) System.out.println(professor.getNome());

    }
}
