/*Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
deles é o maior, imprimindo na resposta o nome da variável e o seu valor. */

import java.util.Scanner;

public class L02Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Informe o primeiro numero inteiro: ");
        valor1 = in.nextInt();

        System.out.println("Informe o seguno numero inteiro: ");
        valor2 = in.nextInt();

        if(valor1>valor2){
            System.out.println("O valor maior é o valor1 = " + valor1);
        } else if (valor1<valor2) {
            System.out.println("O valor maior é o valor2 = " + valor2);
        } else {
            System.out.println("Os valores são iguais, tente colocar números diferentes!");
        }
    }
    
}
