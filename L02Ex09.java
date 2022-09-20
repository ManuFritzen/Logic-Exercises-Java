/* Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692 */

import java.util.Scanner;

public class L02Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double raio, diametro, comprimento, area, pi;
        pi = 3.141692;

        System.out.println("Informe o valor do raio da circunferência: ");
        raio = in.nextFloat();

        diametro = 2*raio;
        comprimento = 2*pi*raio;
        area = pi*raio*raio;

        System.out.println("O diametro da sua circunferencia e igual a " + diametro + "cm, o comprimento é: " + comprimento + "cm e a area é: " + area + "cm.");
    }
    
}
