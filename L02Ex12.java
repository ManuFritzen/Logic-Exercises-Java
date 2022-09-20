/*As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
de maçãs compradas, calcule e escreva o custo total da compra. */
import java.util.Scanner;

public class L02Ex12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int quantMacas;
        float valorCompra;

        System.out.println("Informe a quantidade de macas que voce quer comprar: ");
        quantMacas = in.nextInt();

        if(quantMacas < 12){
            valorCompra = (float) (quantMacas*1.5);
        } else {
            valorCompra = (float) (quantMacas*1.3);
        }

        System.out.printf("O custo total da compra será de R$%.2f", valorCompra);
    }
    
}
