import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        int[] thomas1 = new int[10];
        int[] thomas2 = new int[10];
        int[] thomas3 = new int[10];

        ler(thomas1, thomas2);
        somar(thomas1, thomas2, thomas3);
        escrever(thomas1, thomas2, thomas3);
    }

    public static void ler(int[] thomas1, int[] thomas2) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os valores do primeiro vetor ");

        for (int i = 0; i < 10; i++) {
            thomas1[i] = teclado.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor ");

        for (int i = 0; i < 10; i++) {
            thomas2[i] = teclado.nextInt();
        }

        teclado.close();
    }

    public static void somar(int[] thomas1, int[] thomas2, int[] thomas3) {
        for (int i = 0; i < 10; i++) {
            thomas3[i] = thomas1[i] + thomas2[i];
        }
    }

    public static void escrever(int[] vetor1, int[] vetor2, int[] vetor3) {
        System.out.println("\nVetor 1 ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor 2 ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor2[i] + " ");
        }

        System.out.println("\nVetor 3 (soma dos vetores 1 e 2):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor3[i] + " ");
        }
    }
}

//usar \n pra passar a linha