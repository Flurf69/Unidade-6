import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        double[] vetor = new double[12];
        lerValores(vetor);
        double media = calcularMedia(vetor);
        imprimirValoresMaioresQueMedia(vetor, media);
    }

    public static void lerValores(double[] vetor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os 12 valores:");
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = teclado.nextDouble();
        teclado.close();
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor)
            soma += valor;
        return soma / vetor.length;
    }

    public static void imprimirValoresMaioresQueMedia(double[] vetor, double media) {
        System.out.println("Valores maiores que a média:");
        for (double valor : vetor) {
            if (valor > media)
                System.out.println(valor);
        }
    }
}