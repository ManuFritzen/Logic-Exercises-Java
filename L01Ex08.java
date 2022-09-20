//Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
//A entrada de dados será:
//Número total de eleitores;
//Número de votos válidos;
//Número de votos brancos;
//Número de votos nulos.
//O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
//relação ao total de eleitores):
//Percentual de votos válidos;
// Percentual de votos brancos;
//Percentual de votos nulos;
 

import java.util.Scanner;

public class L01Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total, votosValidos, votosBrancos, votosNulos;
        float percentualVV, percentualVB, percentualVN;

        System.out.println("Informe quantos votos válidos foram computados nesta eleição: ");
        votosValidos = in.nextInt();

        System.out.println("Informe quantos votos brancos foram computados nesta eleição: ");
        votosBrancos = in.nextInt();

        System.out.println("Informe quantos votos nulos foram computados nesta eleição: ");
        votosNulos = in.nextInt();

        total = votosBrancos+votosNulos+votosValidos;

        percentualVV = votosValidos*100f/total;
        percentualVB = votosBrancos*100f/total;
        percentualVN = votosNulos*100f/total;

        System.out.println("Obteve-se um total de " + total + " eleitores, sendo:");
        System.out.println("Votos válidos: " + percentualVV + "%");
        System.out.println("Votos em branco: " + percentualVB + "%");
        System.out.println("Votos nulos: " + percentualVN + "%");

    }
    
}
