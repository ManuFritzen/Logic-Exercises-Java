/* Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
mensagem de erro. */
import java.util.Scanner;

public class L02Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valor1, valor2, div;

        System.out.println("Insira um valor real: ");
        valor1 = in.nextFloat();

        System.out.println("Insira outro valor real: ");
        valor2 = in.nextInt();

        if(valor2 != 0) {
            div = valor1/valor2;
            System.out.println("o resultado da divisão do primeiro valor pelo segundo é: " + div);
        } else {
            System.out.println("Erro!! Impossível fazer uma divisão com denominador zero.");
        }
    }
    
}
