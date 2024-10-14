package Questao12;
//12. Sobrecarga de Operadores (Python) / Métodos de Conveniência (Java, Go) Em Python, sobrecarregue o operador + para somar dois objetos Produto baseados no preço.
//Em Java e Golang, crie métodos que permitam essa funcionalidade.

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public Produto somar(Produto outroProduto) {
        double soma = this.preco + outroProduto.getPreco();
        return new Produto("Pacote com " + this.nome + " e " + outroProduto.nome, soma);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto iPhone = new Produto("iPhone", 6000.00);
        Produto airpods = new Produto("Airpods", 1500.00);

        Produto pacote = iPhone.somar(airpods);

        System.out.println(pacote);
    }
}

