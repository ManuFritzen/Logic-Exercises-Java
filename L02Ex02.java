/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área e o perímetro do retângulo.
 */

import java.util.Scanner;

public class L02Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float base, altura, perimetro, area;

        System.out.println("Informe em centimetros a medida da base do retangulo: ");
        base = in.nextFloat();

        System.out.println("Informe em centimetros a medida da altura do retangulo: ");
        altura = in.nextFloat();

        perimetro = 2*(base + altura);
        area = base*altura;

        System.out.printf("O perimetro do retangulo é %.1f cm\nA area do retangulo é %.1f cm²", perimetro, area);

    }
    
}
