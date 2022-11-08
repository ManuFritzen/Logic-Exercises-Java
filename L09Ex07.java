import java.util.Scanner;

public class L09Ex07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for(int i=0 ; i<5 ; i++){
            for(int j=0 ; j<5 ; j++){
                int posicaoI = i + 1;
                int posicaoJ = j + 1;
                System.out.println("Digite o elemento da matriz da posiçao " + posicaoI + posicaoJ);
                int elementoDigitado = in.nextInt();

                matriz[i][j] = elementoDigitado;
            }
        }

        System.out.println("Informe um valor qualquer:");
        int x = in.nextInt();

        for (int lin = 0; lin < matriz.length; lin++) {
            int soma = 0;
            for (int col = 0; col < matriz[lin].length; col++) {
                soma = soma + matriz[lin][col];
            }
            if (x == soma)
                System.out.println("LINHA " + lin);
        }
    }

}
