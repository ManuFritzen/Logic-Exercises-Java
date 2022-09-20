/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor. */
import java.util.Scanner;

public class L02Ex18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int carrosVendidos;
        float totalVendas, porcentagemVendas, salarioFixo, comissaoPorCarro, salarioFinal, comissao;

        System.out.println("Quantos carros você vendeu neste mês: ");
        carrosVendidos = in.nextInt();

        System.out.println("Qual foi o valor total em vendas: ");
        totalVendas = in.nextFloat();
        porcentagemVendas = totalVendas*0.05f;

        System.out.println("Quanto é o seu salário fixo: ");
        salarioFixo = in.nextFloat();

        System.out.println("Quanto você recebe de comissão por carro vendido: ");
        comissaoPorCarro = in.nextFloat();
        comissao = carrosVendidos*comissaoPorCarro;

        salarioFinal = porcentagemVendas+comissao+salarioFixo;

        System.out.printf("Seu salario esse mes sera de R$%.2f", salarioFinal);



        

    }
    
}
