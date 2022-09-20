//Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
//variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
//triângulo.

import java.util.Scanner;

public class L01Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Informe a medida da base do triângulo em centímetros: ");
        base = in.nextFloat();

        System.out.println("Informe a medida da altura do triângulo em centímetros: ");
        altura = in.nextFloat();

        area = base*altura/2;

        System.out.println("a área do triângulo é: " + area + "cm²");


    }
    
}
