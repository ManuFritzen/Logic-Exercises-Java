/*Escreva um algoritmo para ler uma matriz 4x4, calcular e escrever as seguintes
somas dos elementos que estão armazenados:
a. na linha 2 da matriz.
b. na coluna 1 da matriz.
c. na diagonal principal da matriz.
d. na diagonal secundária
e. em toda matriz */

import java.util.Scanner;

public class L10Ex01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaLinha2 = 0;
        int somaCol1 = 0;
        int somaDiagonalP = 0;
        int somaDiagonalS = 0;
        int somaMatriz = 0;

        int contadorDS = 3;

        for(int i = 0 ; i<4 ; i++){
            for(int j =0 ; j<4 ; j++){
                matriz[i][j] = in.nextInt();

                if(i==1){
                    somaLinha2 = somaLinha2 + matriz[1][j];
                }

                if(j==0){
                    somaCol1 = somaCol1 + matriz[i][0];
                }

                if(i==j){
                    somaDiagonalP = somaDiagonalP + matriz[i][j];
                }
                
                somaMatriz = somaMatriz + matriz[i][j];

                //System.out.print(matriz[i][j] + " ");
            }
            somaDiagonalS = somaDiagonalS + matriz[i][contadorDS];
                contadorDS--;
            
        }
        System.out.println( somaLinha2);
        System.out.println( somaCol1);
        System.out.println( somaDiagonalP);
        System.out.println( somaDiagonalS);
        System.out.println( somaMatriz);




    }
    
}
