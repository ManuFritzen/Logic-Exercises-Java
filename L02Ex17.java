/*  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
custo final ao consumidor.*/
import java.util.Scanner;

public class L02Ex17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float custoFabrica, percentuaDistri, impostos, custoFinal;

        System.out.println("Informe o valor de fabrica do automovel: ");
        custoFabrica = in.nextFloat();

        percentuaDistri = custoFabrica*0.28f;
        impostos = custoFabrica*0.45f;

        custoFinal = custoFabrica+percentuaDistri+impostos;

        System.out.printf("O custo fnal do seu automovel sera de R$%.2f", custoFinal);
    }
    
}
