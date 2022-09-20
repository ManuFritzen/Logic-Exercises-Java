/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 álcool - até 20 litros, desconto de 3% por litro
 álcool - acma de 20 litros, desconto de 5% por litro
 gasolina - até 20 litros, desconto de 4% por litro
 gasolina - acima de 20 litros, dewsconto de 6% por litro

 Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4.30 e o preço do
litro do álcool é R$ 3.90.
 */

 import java.util.Scanner;


public class L03Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char tipoComb;  // String tipoComb;
        // char => 1 letra
        // String => texto... (pode ser bem grande)

        float quantidade;
        final float PRECO_GASOLINA = 4.3f;
        final float PRECO_ALCOOL = 3.9f;
        float precoCombustivel;
        float desconto;
        float precoTotal;
        System.out.println("Informe o tipo de combustivel e a quantidade desejada");
        tipoComb = in.next().charAt(0);

        if (tipoComb == 'A') {
            precoCombustivel = PRECO_ALCOOL;
        } else {
            precoCombustivel = PRECO_GASOLINA;
        }

        System.out.print("Quantos litros de combustivel? ");
        quantidade = in.nextFloat();

        if (tipoComb == 'A' && quantidade <= 20) {
            desconto = 0.97f;
        } else if (tipoComb == 'A') {
            desconto = 0.95f;
        } else if (tipoComb == 'G' && quantidade <= 20) {
            desconto = 0.96f;
            System.out.println("DESCONTO DE 4% aplicado");
        } else {
            desconto = 0.94f;
        }


        precoTotal = quantidade * precoCombustivel * desconto;
        System.out.printf("TOTAL R$ %.2f\n", precoTotal);
    }
    
}
