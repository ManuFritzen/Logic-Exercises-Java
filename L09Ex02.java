/*Crie um programa que leia o tamanho de uma matriz quadrada e apresente um
padrão de tabuleiro de xadrez alternando entre 0’s e 1’s. Por exemplo, caso o
usuário digite 4. A seguinte matriz deve ser criada automaticamente: */

import java.util.Scanner;

public class L09Ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int tamanhoMatriz;

        System.out.println("Informe o tamanho da matriz quadrada:");
        tamanhoMatriz = in.nextInt();

        int[][] tabuleiro = new int[tamanhoMatriz][tamanhoMatriz];

        for(int i=0 ; i<tamanhoMatriz ; i++){
            if(i%2==0){            
                for(int j=0 ; j<tamanhoMatriz ; j++){
                    if(j%2==0){
                        tabuleiro[i][j] = 0;
                    }else {
                        tabuleiro[i][j] = 1;
                    }
                }
            } else{
                for(int j=0 ; j<tamanhoMatriz ; j++){
                    if(j%2==0){
                        tabuleiro[i][j] = 1;
                    }else {
                        tabuleiro[i][j] = 0;
                    }
                }
            }
        }
        
        for(int i=0 ; i<tamanhoMatriz ; i++){
            for(int j=0 ; j<tamanhoMatriz ; j++){
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
