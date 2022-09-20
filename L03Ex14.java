/*
 * Faça um programa que receba os valores de 3 notas de um aluno e apresenta um
conceito baseado na tabela abaixo:
média >= 9.0 - Conceito A
7.5 =< média < 9.0 - Conceito B
6.0 =< média < 7.5 - Conceito C
média < 6.0 - Conceito D
 */
import java.util.Scanner;

public class L03Ex14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float nota1, nota2, nota3, media;

        System.out.println("Informe as notas da primeira, segunda  terceira prova: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();

        media = (nota1+nota2+nota3)/3f;

        if(media >= 9){
            System.out.println("Conceito A");
        } else if(media >= 7.5){
            System.out.println("Conceito B");
        } else if(media >= 6){
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }

    }
    
}
