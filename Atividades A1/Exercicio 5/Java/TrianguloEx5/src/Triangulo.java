public class Triangulo {
    private double lado1, lado2, lado3;

    // Construtor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public String getTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        System.out.println("Perímetro: " + triangulo.getPerimetro());
        System.out.println("Tipo: " + triangulo.getTipo());
    }
}