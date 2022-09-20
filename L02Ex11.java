/* Faça um programa que receba dois números e efetua a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
10. */

import java.util.Scanner;

public class L02Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero1, numero2, soma, resultado;
            
        
        System.out.println("Informe dois numeros inteiros: ");
        numero1 = in.nextInt();
        numero2 = in.nextInt();

        soma = numero1+numero2;

        if(soma > 20) {
            resultado = soma + 8;

            
        } else {
            resultado = soma - 10;
        }

        System.out.println(resultado);



    }
    
}
