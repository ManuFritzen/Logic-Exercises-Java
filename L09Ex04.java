/*Criar um algoritmo que inicie de maneira randômica os elementos de uma matriz
inteira 10 x 10 e escreva somente os elementos acima da diagonal principal. */

import java.util.Random;

public class L09Ex04 {
    public static void main(String[] args){
        Random r = new Random();
        int[][] matriz = new int[10][10];
        
        for(int i=0 ; i<10 ; i++){
            for(int j=0 ; j<10 ; j++){
                int elemento = r.nextInt(100);
                matriz[i][j] = elemento;
            }
        }

        for(int i=0 ; i<10 ; i++){
            for(int j=0 ; j<10 ; j++){
                if(i>=j){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
