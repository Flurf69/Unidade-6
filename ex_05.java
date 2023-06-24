import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        String[] thomas = new String[5];
        String[] anaclara = new String[5];
        String[] perguntas = { "Gosta de sertanejo", "gosta de futebol", "gosta de seriados", "gosta de redes sociais",
                "gosta de oktoberfest" };

        ler(thomas, anaclara, perguntas);
        int afinidade = calcular(thomas, anaclara);
        escrever(afinidade);
    }

    public static void ler(String[] thomas, String[] anaclara, String[] perguntas) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            thomas[i] = teclado.next().toUpperCase();
            anaclara[i] = teclado.next().toUpperCase();
        }
        teclado.close();

    }

    public static int calcular(String[] thomas, String[] anaclara) {

        int afinidade = 0;

        for (int i = 0; i < thomas.length; i++) {
            if (anaclara[i].equals("SIM") && thomas[i].equals("SIM")) {
                afinidade += 3;
            } else if ((anaclara[i].equals("IND")  && !thomas[i].equals("IND"))|| (!anaclara[i].equals("IND")  && thomas[i].equals("IND"))){
                afinidade++;
            } else if ((anaclara[i].equals("NAO") && thomas[i].equals("SIM"))|| (anaclara[i].equals("SIM") && (thomas[i].equals("NAO")))){
                afinidade-=2;
            }
        }
        return afinidade;
    }


    public static void escrever(int afinidade){

        if(afinidade == 15){
            System.out.println("CASEM!");
        } else if (afinidade <=10 && afinidade>=14){
            System.out.println("VOCÊS TEM MTO EM COMUM");
        } else if (afinidade <=5 && afinidade >=9){
            System.out.println("talvez não dê certo :( )");
        } else if (afinidade <=0 && afinidade >=4){
            System.out.println("vale um encontro");
        } else if (afinidade <=-9 && afinidade>=-1){
            System.out.println("melhor não perder tempo");
        } else if (afinidade <=-10){
            System.out.println("VOCÊS SE ODEIAM");
        }

    }
}

