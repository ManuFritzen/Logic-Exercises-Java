/* Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.*/

import java.util.Scanner;

public class L04Ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n, soma, contador=2;

        System.out.println("Informe um numero inteiro positivo: ");
        n = in.nextInt();
        soma=0;

        while(contador<=n){
            if(contador % 2 == 0){
                soma = contador + soma;
            }

            contador++;

        }

        System.out.println(soma);
    }
    
}
