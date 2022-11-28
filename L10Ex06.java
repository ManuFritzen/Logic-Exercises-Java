/*Ler um vetor G de 13 elementos que contenha o gabarito da loteria esportiva
codificado da seguinte forma: 1-coluna um, 2-coluna do meio, 3-coluna dois. Logo
após, ler uma matriz 13 x 3 que contenha a aposta de um jogador. Considere que
cada posição da matriz armazenará o valor 1 se for apostado, 0 caso contrário.
Calcular e escrever o número de pontos obtidos pelo jogador. Escrever também o
número de apostas simples, dupla ou tripla utilizadas pelo apostador. */

import java.util.Scanner;

public class L10Ex06 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int quantidadeNumeros = 13;
        int gabaritoLoteria[] = new int[quantidadeNumeros];

        System.out.println("Informe o resultado da loteria:");
        
        for(int i=0 ; i< quantidadeNumeros; i++){
            gabaritoLoteria[i] = in.nextInt();            
        }     

        int[][] apostas = new int[13][3];
                
        for(int i = 0 ; i < 13 ; i++){
            System.out.println("Informe qual foi sua aposta " + (i+1) + "/13");
            for(int j = 0 ; j <3 ; j++){                
                System.out.println("Você apostou na coluna " + (j+1) + " dessa linha? Se sim digite 1, se não digite 0.");
                apostas[i][j] = in.nextInt();
            }            
       }

       int pontos = 0;
       int simples = 0;
       int duplas = 0;
       int triplas = 0;

       for(int i = 0 ; i < 13 ; i++){            
            if(gabaritoLoteria[i] == 1){
                if(apostas[i][0]==1){
                    pontos++;             
                    simples++;
                }
                if(apostas[i][0] ==1  && apostas[i][1] == 1|| apostas[i][0] ==1 && apostas[i][2] ==1){
                    duplas++;
                }
                if(apostas[i][0]==1 && apostas[i][1] ==1 && apostas[i][2] ==1){
                    triplas++;
                }
             }
            if(gabaritoLoteria[i] == 2){
                 if(apostas[i][1]==1){
                    pontos++;                
                    simples++;
                }
                if(apostas[i][0] ==1  && apostas[i][1] == 1|| apostas[i][1] ==1 && apostas[i][2] ==1){
                    duplas++;
                }
                if(apostas[i][0]==1 && apostas[i][1] ==1 && apostas[i][2] ==1){
                    triplas++;
                }
            }
            if(gabaritoLoteria[i] == 3){
                if(apostas[i][2]==1){
                     pontos++;
                     simples++;
                }                
                if(apostas[i][2] ==1  && apostas[i][1] == 1|| apostas[i][0] ==1 && apostas[i][2] ==1){
                    duplas++;
                }
                if(apostas[i][0]==1 && apostas[i][1] ==1 && apostas[i][2] ==1){
                    triplas++;
                }
            }            
       }



       //MOATRANDO TUDO NA TELA

        System.out.println(" Resultado da loteria: ");
        for(int i=0 ; i< quantidadeNumeros; i++){
            System.out.print(gabaritoLoteria[i] + "  ");        
        }

        System.out.println("\nSua aposta: ");
       
        for(int i = 0 ; i < 13 ; i++){        
            for(int j = 0 ; j <3 ; j++){
            System.out.print(apostas[i][j] + " ");            
            }            
        System.out.println();
        }

        System.out.println(pontos + " (pontos)" + "\n" +simples + " (simples)" + "\n" + duplas + " (duplas)" + "\n" + triplas + " (triplas)" );

        
        
    }
}
