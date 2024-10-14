package Questao1;
// 1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.

// Classe Carro
class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano);
    }
}

// Cliente
public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2021);
        Carro carro2 = new Carro("Jeep", "Commander", 2024);
        Carro carro3 = new Carro("Ford","Maverick",2022);

        carro1.exibir();
        carro2.exibir();
        carro3.exibir();
    }
}
