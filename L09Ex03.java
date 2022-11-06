/*Criar um algoritmo que leia os elementos de uma matriz inteira 10 x 10 e escreva
todos os elementos, exceto os elementos da diagonal principal.
*/

import java.util.Scanner;

public class L09Ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<4 ; j++){
                int posicaoI = i + 1;
                int posicaoJ = j+1;
                System.out.println("Digite o elemento da matriz da posiçao " + posicaoI + posicaoJ);
                int elementoDigitado = in.nextInt();

                matriz[i][j] = elementoDigitado;
            }
        }

        for(int i=0 ; i<4 ; i++){
            for(int j=0; j<4 ; j++){
                if(i==j){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
