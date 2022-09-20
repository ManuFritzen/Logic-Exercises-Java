/* Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
cada um representa em relação ao total de eleitores */

import java.util.Scanner;

public class L02Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int votosValidos, votosBrancos, votosNulos, totalEleitores;
        float percentualValidos, percentualBrancos, percentualNulos;

        System.out.println("Informe quantos votos válidos tiveram nessa eleição: ");
        votosValidos = in.nextInt();

        System.out.println("Informe quantos votos em brancos tiveram nessa eleição: ");
        votosBrancos = in.nextInt();

        System.out.println("Informe quantos votos nulos tiveram nessa eleição: ");
        votosNulos = in.nextInt();

        totalEleitores = votosValidos+votosBrancos+votosNulos;

        percentualValidos = votosValidos*100/totalEleitores;
        percentualBrancos = votosBrancos*100/totalEleitores;
        percentualNulos = votosNulos*100/totalEleitores;

        System.out.println("Nessas elições tivemos um total de " + totalEleitores + " eleitores.");
        System.out.printf("Onde obtivemos %.1f porcento de votos válidos. \n%.1f porcento de votos em branco e\n%.1f porcento de votos nulos.", percentualValidos, percentualBrancos, percentualNulos);
    }
    
}
