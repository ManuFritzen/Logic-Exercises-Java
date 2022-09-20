/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
em que a pessoa nasceu). */

import java.util.Scanner;

public class L02Ex14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int anoAtual, anoNascimento, idade;

        System.out.println("Informe o ano atual e após o ano que você nasceu: ");
        anoAtual = in.nextInt();
        anoNascimento = in.nextInt();

        if(anoAtual<=anoNascimento){
            System.out.println("Impossível seu ano de nascimento ser maior que o anoAtual");
        }

        idade = anoAtual-anoNascimento;

        if(idade >= 16){
            System.out.println("Você pode votar esse ano!!");

        } else {
            System.out.println("Você não poderá votar esse ano!!");
        }
    }
    
}
