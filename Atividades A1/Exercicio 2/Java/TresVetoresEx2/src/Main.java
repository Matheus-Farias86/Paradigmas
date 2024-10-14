import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declarar vetores
        int[] vetor_a = new int[10];
        int[] vetor_b = new int[10];
        int[] vetor_c = new int[10];


        for (int i = 0; i< 10;i++){
            // Recebe valores dos vetores
            System.out.printf("Digite o elemento %d do vetor A: ", i);
            vetor_a[i] = scanner.nextInt();
            System.out.printf("Digite o elemento %d do vetor B: ", i);
            vetor_b[i] = scanner.nextInt();

            // Calcula a diferença e coloca dentro do vetor C
            vetor_c[i] = vetor_a[i] - vetor_b[i];
        }
        System.out.println("Vetor C: ");
        for (int i = 0; i<10;i++){
            System.out.printf("Elemento %d do vetor C: %d\n", i, vetor_c[i]);
        }
    }
}