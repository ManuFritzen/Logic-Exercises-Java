//Desenvolva o algoritmo de um programa para calcular a média de duas notas das
//avaliações de um aluno.

import java.util.Scanner;

public class L01Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = in.nextFloat();

        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = in.nextFloat();

        media = (nota1 + nota2)/2;

        System.out.println("A média do aluno foi " + media);
    }
    
}
