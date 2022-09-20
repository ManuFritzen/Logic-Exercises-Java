//O algoritmo deve ter como entrada um número real e a saída deve ser o valor
//atualizado com os 20%.

import java.util.Scanner;

public class L01Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float user, result;
        System.out.println("Informe um número real: ");
        user = in.nextFloat();
        result = user*1.2f;

        System.out.println("O número " + user + " acrescido de 20% é igual a: " + result);
    }
    
}
