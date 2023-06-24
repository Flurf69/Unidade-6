import java.util.Scanner;

public class ex_01 {
    public static void main (String [] args){

    int [] thomas = new int [10];
    Scanner teclado = new Scanner (System.in);

    System.out.println("digite 10 numeros na ordem desejada ");

    for (int i=0;i<10;i++){
        thomas[i] = teclado.nextInt();
    }
    System.out.println(thomas[9]);
    System.out.println(thomas[8]);
    System.out.println(thomas[7]);
    System.out.println(thomas[6]);
    System.out.println(thomas[5]);
    System.out.println(thomas[4]);
    System.out.println(thomas[3]);
    System.out.println(thomas[2]);
    System.out.println(thomas[1]);
    System.out.println(thomas[0]);
    teclado.close();


}
}