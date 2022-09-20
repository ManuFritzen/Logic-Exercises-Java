/*
 * . Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
que:
- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5
 */
import java.util.Scanner;


public class L03Ex13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String produto;
        int quantAdquirida;
        float precoUnidade, total, totalPagar, desconto;

        System.out.println("Informe a descrição do produto e a quantidade adquirida e o preço da unidade: ");
        produto = in.next();
        quantAdquirida = in.nextInt();
        precoUnidade = in.nextFloat();
        total = quantAdquirida*precoUnidade;

        if(quantAdquirida <= 5){
            totalPagar = total*0.98f;
        } else if(quantAdquirida <= 10) {
            totalPagar = total*0.97f;
        } else {
            totalPagar = total*0.95f;
        }

        desconto = total-totalPagar;

        System.out.printf("O total do produto %s foi R$%.2f\nmas com o desconto de R$%.2f\n voce so tera que pagar R$%.2f", produto, total, desconto, totalPagar);
        

    }
    
}
