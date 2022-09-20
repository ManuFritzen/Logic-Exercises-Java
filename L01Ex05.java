//Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
//graus Celsius.

import java.util.Scanner;

public class L01Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float c, f;

        System.out.println("Informe a temeratura em Fahrenheit: ");
        f = in.nextFloat();

        c = (f-32)/9*5;

        System.out.printf("A temperatura em graus Celsius é: %.1f\n", c);
    }
    
}
