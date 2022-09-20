/* Ler três valores (considere que não serão informados valores iguais) e escrever a
soma dos dois maiores. */

import java.util.Scanner;


public class L03Ex03 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3, soma;
        System.out.println("Informe 3 valores inteiros:");
        valor1 = in.nextInt();
        valor2 = in.nextInt();
        valor3 = in.nextInt();

        if(valor1>valor2 && valor2>valor3 || valor2>valor1 && valor1>valor3) {
            soma = valor1+valor2;
            System.out.println("A soma dos dois maiores valores é: " + soma);

        } else if(valor1>valor3 && valor3>valor2 || valor3>valor1 && valor1>valor2) {
            soma = valor1+valor3;
            System.out.println("A soma dos dois maiores valores é: " + soma);
        } else {
            soma = valor3+valor2;
            System.out.println("A soma dos dois maiores valores é: " + soma);
        }
    
    }
    
}
