/*. Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário
deverá digitar 4 informações de
entrada para o sistema, são elas:
- Valor de cada ingresso
- Número de pessoas (público do evento) que são sócias do clube
- Número de pessoas (público do evento) não pagantes (menores de 10
anos)
- Número de pessoas (público do evento) pagantes (sem desconto algum)
O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
e o valor que deixou de ser arrecadada devido aos descontos e isenções */

import java.util.Scanner;

public class L01Ex10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float valorIngresso, rendaTotal, valorDesc, valorPerdido;
        int socios, criancas, pagantes, publicoTotal;

        System.out.println("Informe o valor do ingresso: ");
        valorIngresso = in.nextFloat();

        System.out.println("Informe quantos Sócios adquiriram o ingresso: ");
        socios = in.nextInt();

        System.out.println("Informe quantas crianças menores que 10 anos participaram do evento: ");
        criancas = in.nextInt();

        System.out.println("Informe quantas pessoas pagantes e não sócias adquiriram o igresso: ");
        pagantes = in.nextInt();

        publicoTotal = socios+criancas+pagantes;

        valorDesc = (float) (socios*valorIngresso*0.3);
        
        rendaTotal = (float) ((pagantes*valorIngresso)+(socios*valorIngresso-valorDesc));

        valorPerdido = (float) (criancas*valorIngresso+valorDesc);

        System.out.printf("O público total do evento foi igual a %d pessoas. \nA renda total adquirida com o evento foi de R$ %.2f\nO evento deixou de arrecadar com os descontos e isenções R$ %.2f  ", publicoTotal, rendaTotal, valorPerdido);


    }
}
