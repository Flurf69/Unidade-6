import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        
        while (n > 20) {
            System.out.println("Dado incorreto, o valor é só até 20");
            n = teclado.nextInt();
        }
        int[] thomas = new int[n];
        inserir(thomas);
        arrumar(thomas);
        escrever(thomas);
        teclado.close();
    }

    public static void inserir(int[] thomas) {
        Scanner teclado = new Scanner(System.in);
        
        for (int o = 0; o < thomas.length; o++) {
            thomas[o] = teclado.nextInt();
            
            for (int r = 0; r < o; r++) {
                while (thomas[o] == thomas[r]) {
                    System.out.println("Digite numeros diferentes");
                    thomas[o] = teclado.nextInt();
                }
            }
        }
        
        teclado.close();
    }

    public static void arrumar(int[] thomas) {
        int bolha;
        for (int e = 0; e < (thomas.length - 1); e++) {
            if (thomas[e] > thomas[e + 1]) {
                bolha = thomas[e];
                thomas[e] = thomas[e + 1];
                thomas[e + 1] = bolha;
                e = 0;
            }
        }
    }

    public static void escrever(int[] vetor) {
        System.out.print("Vetor ordenado ");
        
        for (int elemento : vetor) {
            System.out.print("[" + elemento + "] ");
        }
    }
}