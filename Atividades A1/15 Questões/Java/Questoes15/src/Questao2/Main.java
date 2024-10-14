package Questao2;
//2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
    }

    public void frear(int decremento) {
        if (this.velocidade - decremento < 0) this.velocidade = 0;
        else this.velocidade -= decremento;
    }

    public void exibir() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano);
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }
}



// Cliente
public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2021);
        Carro carro2 = new Carro("Jeep", "Commander", 2024);
        Carro carro3 = new Carro("Ford","Maverick",2022);

        carro1.exibir();
        carro1.exibirVelocidade();
        carro1.acelerar(40);
        carro1.exibirVelocidade();
        carro1.frear(10);
        carro1.exibirVelocidade();
        carro1.frear(100);
        carro1.exibirVelocidade();
    }
}
