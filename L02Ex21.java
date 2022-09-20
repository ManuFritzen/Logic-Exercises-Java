/* A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros
que deverá colocar no tanque de seu carro para que ele possa percorrer um
determinado número de voltas até o primeiro reabastecimento. Escreva um
algoritmo que leia o comprimento da pista (em metros), o número total de voltas a
serem percorridas no grande prêmio, o número de reabastecimentos desejados e o
consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo
de litros necessários para percorrer até o primeiro reabastecimento. Observação:
Considere que o número de voltas entre os reabastecimentos é o mesmo.*/

import java.util.Scanner;

public class L02Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float comprimentoPista, consumoCarro, totalLitros, minimoLitros;
        int totalVoltas, quantDesejadasReabast;

        System.out.println("Informe o comprimento da pista e metros: ");
        comprimentoPista = in.nextFloat();

        System.out.println("Informe o total de voltas a serem percorridas: ");
        totalVoltas = in.nextInt();

        System.out.println("Informe o número desejado de paradas para reabastecimento: ");
        quantDesejadasReabast = in.nextInt();

        System.out.println("Informe qual é o consumo do carro em metros por litros: ");
        consumoCarro = in.nextFloat();

        totalLitros = comprimentoPista*totalVoltas/consumoCarro;

        minimoLitros = totalLitros/quantDesejadasReabast;

        System.out.println("o número minimo de litros para percorrer ate o primeiro reabastecimento é: " + minimoLitros);
    }
    
}
