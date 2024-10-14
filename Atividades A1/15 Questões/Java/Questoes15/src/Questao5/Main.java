package Questao5;
//5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

import java.util.ArrayList;
import java.util.List;

// Classe Animal (Superclasse)
class Animal {
    protected String especie;
    protected String nome;

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    public String emitirSom() {
        return ""; // Método a ser sobrescrito pelas subclasses
    }
}

// Classe Cachorro (Subclasse de Animal)
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super("Cachorro", nome);
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }
}

// Classe Gato (Subclasse de Animal)
class Gato extends Animal {
    public Gato(String nome) {
        super("Gato", nome);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}

// Cliente
public class Main {
    public static void emitirSonsDosAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.nome + " diz: " + animal.emitirSom());
        }
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        Animal gato = new Gato("Mimi");

        // Adicionando os animais a uma lista
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        // Chama o método polimórfico
        emitirSonsDosAnimais(animais);
    }
}

