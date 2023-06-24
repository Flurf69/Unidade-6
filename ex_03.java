import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        double[] thomas = new double[12];

        ler(thomas);
        ajustar(thomas);
        escrever(thomas);
    }

    public static void ler(double[] thomas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 12 valores reais ");

        for (int i = 0; i < 12; i++) {
            thomas[i] = scanner.nextDouble();
        }

        scanner.close();
    }

    public static void ajustar(double[] thomas) {
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                thomas[i] *= 1.02; 
            } else {
                thomas[i] *= 1.05; 
            }
        }
    }

    public static void escrever(double[] vetor) {
        System.out.println("Valores atualizados ");

        for (int i = 0; i < 12; i++) {
            System.out.println(vetor[i]);
        }
    }
}
