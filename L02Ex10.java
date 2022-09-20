/* Faça um programa que receba a idade de um nadador e classifique-o numa das
seguintes categorias:
• Adulto (idade >= 18);
• Juvenil (idade >= 14 e idade < 18);
• Infantil (idade >=9 e idade < 14);
• Mirim (Idade < 9). */

import java.util.Scanner;

public class L02Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;

        System.out.println("Informe a idade do nadador: ");
        idade = in.nextInt();

        if(idade>=18){
            System.out.println("A categoria do atleta é ADULTO");
        } else if(idade >= 14){
            System.out.println("A categoria do atleta é Juvenil");
        } else if(idade >= 9){
            System.out.println("A categoria do atleta é Infantil");
        } else {
            System.out.println("A categoria do atleta é Mirim");
        }
    }
    
}
