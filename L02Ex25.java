/* Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
um cofrinho que contenha:
♦ N moedas de 1 real;
♦ N moedas de 50 centavos;
♦ N moedas de 25 centavos;
♦ N moedas de 10 centavos;
♦ N moedas de 5 centavos;
O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
para a compra o produto X*/

import java.util.Scanner;

public class L02Ex25 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float valorProduto, moeda1, moeda50, moeda25, moeda10, moeda5, totalReais;

        System.out.println("Informe  valor do produto que você quer comprar: ");
        valorProduto = in.nextFloat();

        System.out.println("Informe a quantidade de moedas de 1 real que tem no seu cofrinho: ");
        moeda1 = in.nextFloat();
        System.out.println("Informe a quantidade de moedas de 50 centavos que tem no seu cofrinho: ");
        moeda50 = in.nextFloat();
        System.out.println("Informe a quantidade de moedas de 25 centavos tem no seu cofrinho: ");
        moeda25 = in.nextFloat();
        System.out.println("Informe a quantidade de moedas de 10 centavos tem no seu cofrinho: ");
        moeda10 = in.nextFloat();
        System.out.println("Informe a quantidade de moedas de 5 centavos que tem no seu cofrinho: ");
        moeda5 = in.nextFloat();

        totalReais = moeda1 + moeda50*0.5f + moeda25*0.25f + moeda10*0.1f + moeda5*0.05f;

        if(totalReais >= valorProduto){
            System.out.printf("Voce tem R$%.2f no seu cofrinho, \né o bastante para comprar o produto", totalReais);
        } else {
            System.out.printf("Voce tem R$%.2f no seu cofrinho, \nnao é o bastante para comprar o produto", totalReais);
        }




    }
    
}
