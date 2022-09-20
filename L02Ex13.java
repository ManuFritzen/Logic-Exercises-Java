/*. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
(considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
a média calculada.
 */

 import java.util.Scanner;

public class L02Ex13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        float nota1, nota2, media;

        System.out.println("Informe a nota da sua primeira e da sua segunda avaluação: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();

        media = (nota1+nota2)/2;

        if(media>=6){
            System.out.println("Aluno APROVADO!! Nota final = " + media);
        } else {
            System.out.println ("Aluno REPROVADO!!! Nota final = " + media);
        }
    }
    
}
