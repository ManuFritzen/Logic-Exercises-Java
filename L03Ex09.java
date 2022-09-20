/*Escreva um algoritmo que leia as notas das duas avaliações normais e a nota da
avaliação optativa. Caso o aluno não tenha feito a optativa deve ser fornecido o valor
–1. Calcular a média do semestre considerando que a prova optativa substitui a nota
mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que
indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as
informações abaixo:
Aprovado : media >= 6.0
Reprovado: media < 3.0
Exame : media >= 3.0 e < 6.0 
*/
import java.util.Scanner;

public class L03Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota1, nota2, optativa, media;

        System.out.println("Informe a nota da primeira prova, segunda prova e da prova optativa, caso não tenha feito a optativa, digitar -1: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        optativa = in.nextFloat();

        if(optativa == -1 && optativa<nota1 && optativa<nota2) {
            media = (nota1+nota2)/2;
        } else if (nota1>optativa && nota2<optativa){
            media = (nota1+optativa)/2;
        } else {
            media = (nota2+optativa)/2;
        }

        if(media>=6){
            System.out.println("Aprovado! sua media foi: " + media);
        } else if(media < 3){
            System.out.println("Reprovado! sua media foi: " + media);
        } else {
            System.out.println("Em exame! sua media foi: " + media);
        }
   
   
    }


    
}
