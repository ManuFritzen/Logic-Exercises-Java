/* Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo). */

import java.util.Scanner;

public class L02Ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int user;

        System.out.println("Informe um número inteiro: ");
        user = in.nextInt();

        if(user < 0){
            System.out.println("O número informado é negativo.");
        } else {
            System.out.println("O número informado é positivo.");
        }


    }
    
}
