/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
quantidade média, usando a seguinte fórmula: ((quantidade média = quantidade
máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
quantidade média escrever a mensagem Não efetuar compra, senão escrever a
mensagem Efetuar compra.
*/

import java.util.Scanner;

public class L02Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantAtual, quantMax, quantMin;
        float quantMedia;

        System.out.println("Informe a quantidade atual do produto A em estoque:");
        quantAtual = in.nextInt();
        System.out.println("Informe a quantidade maxima que pode ter do produto A em estoque: ");
        quantMax = in.nextInt();
        System.out.println("Informe a quantidade minima que deve ter deste produto em estoque: ");
        quantMin = in.nextInt();

        quantMedia = (quantMax+quantMin)/2f;

        if(quantAtual>=quantMedia){
            System.out.println("Não efetuar a compra!");
        } else {
            System.out.println("Efetuar a compra!");
        }

    }
    
}
