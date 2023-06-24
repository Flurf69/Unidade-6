import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        int[][] thomas = new int[3][30];
        double mg = mt(thomas);
        
        ler(thomas);
        mh(thomas);
        jm(thomas);
        am(thomas, mg);
    }

    public static void ler(int[][] thomas) {
        Scanner teclado = new Scanner(System.in);
        
        
        for (int t = 0; t < 30; t++) {
            for (int i = 0; i < 3; i++) {
                thomas[i][t] = teclado.nextInt();
                
                if (i == 0 && (thomas[i][t] < 0 || thomas[i][t] > 10)) {
                    System.out.print("valor nvalido");
                    thomas[i][t] = teclado.nextInt();
                } else if (i == 1 && (thomas[i][t] != 1 && thomas[i][t] != 2)) {
                    System.out.print("valor invalido");
                    thomas[i][t] = teclado.nextInt();
                } else if (i == 2 && thomas[i][t] < 0) {
                    System.out.print("valor invalido");
                    thomas[i][t] = teclado.nextInt();
                }
            }
        }
        teclado.close();
    }

    public static double mt (int[][] thomas) {
        int soma1 = 0;
        for (int o = 0; o < 30; o++) {
            soma1 += thomas[0][o];
        }
        
        double mg = (soma1 / 30.0);
        System.out.println("Nota média: " + mg);
        return mg;
    }

    public static void mh(int[][] thomas) {
        int soma2 = 0;
        int qtdh = 0;
        
        for (int w = 0; w < 30; w++) {
            
            if (thomas[1][w] == 2){
                soma2 += thomas[0][w];
            qtdh++;
            }
        }
        
        double mediah = (soma2 / qtdh);
        System.out.println("Nota média dos homens: " + mediah);
    }

    public static void jm(int[][] thomas) {
        int idademj = 999999999;
        int pmj = -1;
        
        for (int p = 0; p < 30; p++) {
            
            if (thomas[1][p] == 1 && thomas[2][p] < idademj) {
                idademj = thomas[2][p];
                pmj = p;
            }
        }
        System.out.println("Nota da mulher mais jovem: " + thomas[0][pmj]);
    }

    public static void am(int[][] thomas, double mediageral) {
        int qtdm = 0;
        
        for (int q = 0; q < 30; q++) {
            
            if (thomas[1][q] == 1 && thomas[2][q] > 50 && thomas[0][q] > mediageral) {
                qtdm++;
            }
        }
        System.out.println("Mulheres (50+ anos) que deram nota superior à média geral: " + qtdm);
    }
}
