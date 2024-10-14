package Questao6;
//6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

//Classe Motor
class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("O motor está ligado.");
    }

    public void desligar() {
        System.out.println("O motor está desligado.");
    }
}
// Classe Carro
class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = new Motor("Gasolina", 150);
    }

    public void ligar() {
        motor.ligar();
        System.out.println("O carro está pronto para rodar.");
    }

    public void desligar() {
        motor.desligar();
        System.out.println("O carro foi desligado.");
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

        carro1.ligar();
        carro1.desligar();
    }
}
