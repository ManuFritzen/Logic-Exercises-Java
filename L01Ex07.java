/*Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
média da viagem, informe o tempo que uma família levará saindo de sua cidade de
férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
calculado. */

import java.util.Scanner;


public class L01Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float veloMedia, distancia, tempoViagem;

        System.out.println("Informe a distância, em km, que você vai viajar nessas férias: ");
        distancia = in.nextFloat();

        System.out.println("Informe qual será a velocidade média nessa viagem em km por hora: ");
        veloMedia = in.nextFloat();

        tempoViagem = distancia/veloMedia;

        System.out.printf("Você levará %.1f horas para chegar no seu destino.", tempoViagem);
    }
    
}
