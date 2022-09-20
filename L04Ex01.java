/* Ler um número inteiro n. Escrever a soma de todos os números de 1 até n*/

import java.util.Scanner;

public class L04Ex01 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int n, soma, contador=1;
        System.out.println("Informe um numero inteiro:");
        n = in.nextInt();

        soma = 0;

        while(contador <= n){            

            soma = contador + soma;

            contador++;
        }

        System.out.println("A soma de todos os numero de 1 ate " + n + " e " + soma);
    }
    
}
