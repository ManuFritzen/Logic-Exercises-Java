/* Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês e qual será seu salário atual. Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.
a. Pergunte ao usuário qual a % de imposto que é descontada do salário. */

import java.util.Scanner;

public class L02Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorHora, salarioMes, descontoSalario, imposto, porcentoImposto, valorLiquido; 
        int horasTrabalhadas;

        System.out.println("Informe o valor que você ganha por hora trabalhada: ");
        valorHora = in.nextFloat();

        System.out.println("Informe quantas horas você trabalha por mês: ");
        horasTrabalhadas = in.nextInt();

        salarioMes = (float) valorHora*horasTrabalhadas;

        System.out.printf("O seu salário do mês será de R$ %.2f\n", salarioMes );

        System.out.println("Qual a porcentagem de imposto que é descontada do seu salário? ");
        imposto = in.nextFloat();

        porcentoImposto = imposto/100;

        descontoSalario = (float) salarioMes*porcentoImposto;
        valorLiquido = (float) salarioMes-descontoSalario;

        System.out.printf("Você recebe em valor líquido R$%.2f\n", valorLiquido);
    }
    
}
