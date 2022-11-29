/*Escreva um algoritmo para ler 2 matrizes A 3x5 e B 3x5. Criar uma matriz S com a
soma matricial de A e B e uma matriz D com a diferença entre A e B. Escrever a
matriz S e logo após a matriz D. */

import java.util.Scanner;

public class L10Ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] matrizA = new int[3][5];
        int[][] matrizB = new int[3][5];
        int[][] matrizS = new int[3][5];
        int[][] matrizD = new int[3][5];
        
        for(int i= 0 ; i < matrizA.length ; i++){
            for(int j = 0 ; j < matrizA.length ; j++){
                matrizA[i][j] = in.nextInt();
            }
        }

        for(int i= 0 ; i < matrizB.length ; i++){
            for(int j = 0 ; j < matrizB.length ; j++){
                matrizA[i][j] = in.nextInt();
            }
        }
    }
    
}
