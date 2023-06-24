import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        
        double[] thomas = new double[n];
        double t = leitura(thomas);
        boolean tem = contemValor(thomas, t);
        
        System.out.println(tem);
        
        
        teclado.close();
    }

    public static double leitura(double[] thomas) {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < thomas.length; i++) {
            thomas[i] = teclado.nextDouble();
        }
        
        double t = teclado.nextDouble();
        teclado.close();
        return t;
    }




    public static boolean contemValor(double[] thomas, double t) {
        boolean tem = false;
        
        for (int a = 0; a < thomas.length; a++) {
            if (thomas[a] == t) {
                tem = true;
            }
        }
        return tem;
    }
}