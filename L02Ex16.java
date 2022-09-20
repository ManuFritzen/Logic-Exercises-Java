/* Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
concedido. Nenhum dos valores informados pode ser zero ou negativo*/

import java.util.Scanner;

public class L02Ex16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float valorEmprestimo, salario, limitePrestacao, valorPrestacao;
        int quantPrestacao;

        System.out.println("Informe o valor que você quer de emprestimo: ");
        valorEmprestimo = in.nextFloat();

        System.out.println("Agora informe emquantas vezes voce deseja pagar esse emprestimo: ");
        quantPrestacao = in.nextInt();

        System.out.println("Por ultimo, informe seu salario: ");
        salario = in.nextFloat();

        if(valorEmprestimo<0||quantPrestacao<0||salario<0){
            System.out.println("Os valores informados nao devem ser zero ou negativos!");
        }

        valorPrestacao = valorEmprestimo/quantPrestacao;
        limitePrestacao = salario*0.3f;

        if(valorPrestacao>limitePrestacao){
            System.out.println("Emprestimo nao concedido, valor da prestacao ultrapassou o limite.");
        } else {
            System.out.println("Emprestimo concedido!");
        }
    }
    
}
