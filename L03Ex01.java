//Ler um valor e escrever se é positivo, negativo ou zero.

import java.util.Scanner;


public class L03Ex01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int number;
        System.out.println("Informe um número inteiro: ");
        number = in.nextInt();

        if(number>0){
            System.out.println("Numero positivo.");
        } else if(number<0){
            System.out.println("Numero negativo.");
        } else {
            System.out.println("Numero zero.");
        }
    }
}
