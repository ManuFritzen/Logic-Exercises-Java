/*
 * Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
do lado (em cm). Calcular e imprimir o seguinte:
 Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
perímetro.
Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 Se o número de lados for igual a 5 escrever PENTaGONO.
Observação: Considere que o usuário só informará os valores 3, 4 ou 5.
 */

import java.util.Scanner;

public class L03Ex11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numeroLados;
        float lado1, lado2, lado3,  perimetroTriangulo, areaQuadrado;         

        System.out.println("O poligono tem 3, 4 ou 5 lados? ");
        numeroLados = in.nextInt();

        if(numeroLados == 3){
            System.out.println("Você informou os lados de um triangulo. Informe as medidas dos lados em centimetros: ");
            lado1 = in.nextFloat();
            lado2 = in.nextFloat();
            lado3 = in.nextFloat();

            perimetroTriangulo = lado1+lado2+lado3;

            System.out.println("O perimetro do triangulo é " + perimetroTriangulo + "cm");
        } else if(numeroLados == 4){
            System.out.println("Você informou os lados de um quadrado. Informe a medida do lado do quadrado: ");
            lado1 = in.nextFloat();

            areaQuadrado = lado1*lado1;

            System.out.println("A area do quadrado é " + areaQuadrado + "cm^2");
        } else if(numeroLados == 5){
            System.out.println("Você informou a quantidade de lados de um PENTAGONO ");
        } else {
            System.out.println("Responda a quantidade que eu te pedi!!!");
        }




    }
    
}
