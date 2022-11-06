
/*Faça um programa que leia duas matrizes 3x3 e apresente o resultado na tela. A
soma de matrizes é feita utilizando a seguinte regra: */

import java.util.Random;
import java.util.Scanner;
public class L09Ex01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Random r = new Random();

        int[][] matrizA =new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] somaMatriz = new int[3][3];

        System.out.println("Matriz A:");
        System.out.println();


        //Preenchimento matriz A

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                int aleatorio= r.nextInt(100);

                matrizA[i][j] = aleatorio;

                System.out.print(matrizA[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        System.out.println();


        // Preenchimento matriz B

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                int aleatorio= r.nextInt(100);

                matrizB[i][j] = aleatorio;

                System.out.print(matrizB[i][j] + " ");

            }
            System.out.println();
        }

        //Soma A + B

        System.out.println("Soma:");
        System.out.println();


        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                somaMatriz[i][j] = matrizA[i][j] + matrizB[i][j];

                System.out.print(somaMatriz[i][j] + " ");

            }
            System.out.println();
        }






    }
    
}
