// Desenvolva o algoritmo de um programa onde o usuário irá informar um número
//inteiro e o programa deve calcular e exibir quadrado do número informado pelo
//usuário.

import java.util.Scanner;

public class L01Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int user, result;

        System.out.println("Informe um número inteiro: ");
        user = in.nextInt();
        result = user*user;

        System.out.println("O quadrado do número " + user + " é: " + result);
    }
}