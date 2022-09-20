/*Faça um algoritmo que converta metros para centímetros. Lembrando que 1m =
100cm
 */

import java.util.Scanner;


public class L02Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float metros, centimetros;

        System.out.println("Informe quantos metros você quer converter: ");
        metros = in.nextFloat();

        centimetros = metros*100;

        System.out.println(metros + "m é igual a: " + centimetros + "cm");


    }
    
}
