//Desenvolva o algoritmo de um programa onde o usuário irá informar um número
//inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
//número digitado pelo usuário
import java.util.Scanner;

public class L01Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int user, result;
        System.out.println("Informe um número inteiro: ");
        user = in.nextInt();

        result = user -1;

        System.out.println("O antecessor do número " + user + " é: " + result);
    }

}