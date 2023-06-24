import java.util.Scanner;

public class ex_10{
    public static void main(String[] args) {
        new ex_10();
    }

    public ex_10() {
        
        Scanner teclado = new Scanner(System.in);
        int[] thomas = new int[50];
        int t = 0;
        int resposta;
        
        do {
           
           
            resposta = menu(teclado);
            
            
            switch (resposta) {
                case 1:
                    t = incluirValor(teclado, thomas, t);
                    break;
                case 2:
                    pesquisarValor(teclado, thomas);
                    break;
                case 3:
                    alterarValor(teclado, thomas);
                    break;
                case 4:
                    t = excluirValor(teclado, thomas, t);
                    break;
                case 5:
                   mostrarVetor(thomas, t);
                    break;
                case 6:
                   ordenarVetor(thomas, t);
                    break;
                case 7:
                   inverterVetor(thomas, t);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (resposta != 8);
        teclado.close();
    }

    private int menu(Scanner teclado) {
        System.out.println("escolha uma opção para o vetor");
        System.out.println("1-adcionar valor");
        System.out.println("2- pesquisar valor");                                              
        System.out.println("3-alteraar valor");
        System.out.println("4-excluir valor");                                         
        System.out.println("5-mostrar valores");                    
        System.out.println("6-organizar valores");
        System.out.println("7-inverter valores");
        System.out.println("8-sair");
        
        int escolha = teclado.nextInt();
        return escolha;
    }

    private int incluirValor(Scanner teclado, int[] thomas, int t){
        if (t<50){
       
            thomas[t] = teclado.nextInt();
        System.out.println("[" + (thomas[t]) + "] incluído no vetor.\n");
        t++;
        } else 
        
        
        System.out.println("Não é possível incluir. Limite de posições (50) atingido.\n");
        System.out.println(t);
        return t;
    }

    private void pesquisarValor(Scanner teclado, int []thomas){
        
        boolean cadastrado = false;
        int valor = teclado.nextInt();
        
        
        for (int a = 0; a<thomas.length;a++){
            
            if (thomas[a]==valor){
                cadastrado = true;
            }
        }
        if (cadastrado){
            System.out.println("valor já existe");
        } else {
            System.out.println("valor não cadastrado");
        }
}

    private void alterarValor (Scanner teclado, int[] thomas){
        
        System.out.print("Valor da alteração");
        int alterado = teclado.nextInt();
        int m = 0;
        
        
        do {
           
            if (alterado==thomas[m]){
            System.out.print("Novo valor ");
            int alteracao = teclado.nextInt();
            System.out.println(thomas[m]+ "alterado para " + alteracao);
            thomas[m]=alteracao;
            break; }else
            m++;
        } while (m<50);
        
        
        if (m==50)
        System.out.println("Número não encontrado.\n");
        }

        private int excluirValor(Scanner teclado, int[]thomas, int t) {
        
            System.out.print("Valor a ser excluído: ");
        int excluido = teclado.nextInt();
        boolean achou = false;
        
        
        for (int c = 0; c < thomas.length; c++) {
            if (thomas[c] == excluido) {
                for (int s = (c + 1); s < thomas.length; s++) {
                    thomas[s - 1] = thomas[s];
                }
                achou = true;
                break;
            }
        }
        if (achou) {
            
            System.out.println( + excluido + "excluído");
            t--;
         } else
            System.out.println("Número não encontrado");
        return t;
    }

    private void mostrarVetor (int [] vetor, int j){
    
        for (int e =0; e<j; e++){
        System.out.print(vetor[e]);
    }
    System.out.println("");
    }

    private void ordenarVetor (int [] thomas, int h){
        int bolha;
        
        
        for (int y = 0; y<(h-1); y++) {
            
            if (thomas[y] > thomas[y + 1]) {
                bolha = thomas[y];
                thomas[y] = thomas[y + 1];
                thomas[y + 1] = bolha;
                y = 0;
            }
    }
}

    private void inverterVetor(int[]vetor, int j) {
        int temp = 0;
        
        for (int i = 0; i<j; i++) {
            
            for (int f = 0; f < i; f++) {
                 temp = vetor[i];
                 vetor[i] = vetor[f];
                 vetor[f] = temp;
                }
            }
        }

}