/*Escreva um algoritmo para ler as dimensões de uma cozinha retangular
(comprimento, largura e altura), calcular e escrever a quantidade de caixas de
azulejos para se colocar em todas as suas paredes (considere que não será
descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1.5
m2 . */

import java.util.Scanner;

public class L02Ex19 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float largura, altura, comprimento, cxAzulejo, totalCaixasAzulejos;
        cxAzulejo = 1.5f;

        System.out.println("Infomes as dimensões da sua cozinha na ordem comprimento, largura e altura: ");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();

        totalCaixasAzulejos = (2*comprimento*altura+2*largura*altura)/cxAzulejo;

        System.out.println("Você precisa de " + totalCaixasAzulejos + " caixa de azuleijos para sua cozinha.");

    }
    
}
