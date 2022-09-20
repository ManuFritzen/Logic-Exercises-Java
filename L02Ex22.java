/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem Saldo
Positivo, senão escrever a mensagem saldo Negativo.
*/

import java.util.Scanner;

public class L02Ex22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String conta;
        float saldo, debito, credito, saldoAtual;

        System.out.println("Informe o numero da sua conta: ");
        conta = in.next();
        System.out.println("Informe o saldo da sua conta: ");
        saldo = in.nextFloat();
        System.out.println("Informe o valor que voce fez de debito: ");
        debito = in.nextFloat();
        System.out.println("Informe quanto o banco te deu de credito: ");
        credito = in.nextFloat();

        saldoAtual = saldo - debito + credito;

        if(saldoAtual >= 0){
            System.out.printf("A conta: %s\n esta com saldo positivo! R$%.2f\n", conta, saldoAtual);
        } else {
            System.out.printf("A conta: %s\n esta com saldo negativo! R$%.2f\n", conta, saldoAtual);
        }
    }
    
}
