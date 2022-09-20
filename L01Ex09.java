/*Considere que você deseja uma comemoração especial para o seu aniversário e
assim irá convidar familiares a amigos para um churrasco na sua residência. Você
irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
de uma forma de calcular a quantidade certa a ser adquirida.
Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
consomem uma quantidades diferentes de carne.
Consumo de carne médio
(http://www.embaixadordochurrasco.com.br/calculochurrasco):
Homens: 400 gramas
Mulheres: 320 gramas
Crianças: 200 gramas
*Observação: geralmente é adicionada uma margem de segurança na quantidade
de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
de 20% no total de carne a ser adquirida. */

import java.util.Scanner;

public class L01Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int homem, mulher, crianca, gramasHomem, gramasMulher, gramasCrianca;
        float total, totalKilos;

        System.out.println("Informe a quantidade de convidados homens: ");
        homem = in.nextInt();

        System.out.println("Informe a quantidade de convidadas mulheres: ");
        mulher = in.nextInt();

        System.out.println("Informe a quantidade de convidados crianças: ");
        crianca = in.nextInt();

        gramasHomem = homem*400;
        gramasMulher = mulher*320;
        gramasCrianca = crianca*200;

        total = (float) ((gramasHomem+gramasMulher+gramasCrianca)*1.2);

        totalKilos = total/1000;

        System.out.printf("Deve ser adquirodo para o seu aniversário aproximadamente  %.1f kg de carne", totalKilos);




    }
}
