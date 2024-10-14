public class Retangulo {

    private int comprimento;
    private int largura;
    // Construtor
    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    // Método para calcular a área
    public int calcularArea() {
        return comprimento * largura;
    }
    // Método para calcular o perímetro
    public int calcularPerimetro() {return 2 * (comprimento + largura);}

    public static void main(String[] args) {
        // Criando objetos e instancias deles.
        Retangulo ret = new Retangulo(200, 300);

        // Exibindo os resultados
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}
