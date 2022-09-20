/*Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado */

import java.util.Scanner;

public class L04Ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n, contador;
        contador=3;

        System.out.println("Informe um numero inteiro: ");
        n = in.nextInt();

        while(contador<=n){
            if(n % contador != 0){
                contador++;
            } else if(n % contador == 0 && contador != n)  {
                contador = n+1;
                System.out.println("Nao é numero primo");                
            } else {
                contador = n+1;
                System.out.println("numero primo!");
                
            }
        }
    }
}
