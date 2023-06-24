import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        new ex_08();
    }

    public ex_08() {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        double[][] thomas = botar(teclado, soma);
        teclado.close();
        soma = soma(thomas, soma);
        frequencia(thomas, soma);
        escrever(thomas, soma);
    }

    public double[][] botar(Scanner teclado, double soma) {
        int n = teclado.nextInt();
       
       
        while (n > 20) {
            System.out.println("numero incorreto");
            n = teclado.nextInt();
        }
        double[][] thomas = new double[n][2];
        
        
        for (int t = 0; t < n; t++) {
            thomas[t][0] = teclado.nextDouble();
            thomas[t][1] = 1;
        }
        return thomas;
    }

    private double soma(double[][] thomas, double soma) {
       
       
        for (int a = 0; a < thomas.length; a++) {
            soma += thomas[a][0];
        }
       
       
       
        boolean igual = true;
      
        do {
           
            for (int c = 0; c < thomas.length; c++) {
                if (thomas[c][0] == soma) {
                    soma++;
                    igual = true;
                } else
                    igual = false;
            }
        } while (igual);
        return soma;
    }

    private double[][] frequencia(double[][] thomas, double soma) {
        
        for (int b = 0; b < thomas.length; b++) {
           
           
            for (int e = 0; e < b; e++) {
               
                if (thomas[e][0] == thomas[b][0]) {
                    thomas[b][0] = soma;
                    thomas[e][1]++;
                }
            }
        }
       
        return thomas;
    }

    private void escrever(double[][] thomas, double soma) {
        System.out.println("   VALOR    E    FREQUÊNCIA");
        
        for (int c = 0; c < thomas.length; c++) {
            
            if ((thomas[c][0] != soma)) {
                System.out.print("    " + thomas[c][0] + "              ");
                System.out.printf("%.0f\n", thomas[c][1]);
            }
        }

    }
}