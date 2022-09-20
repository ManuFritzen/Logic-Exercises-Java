/*Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4.599, escreva um algoritmo para
ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
o número de litros de combustível gasto e o valor total (R$) recebido dos
passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
do dia.
 */
import java.util.Scanner;

public class L02Ex20 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float valorCombustivel, kmInicial, kmFinal, quantLitros, totalRecebido, mediaConsumo, lucro;

        valorCombustivel = 4.599f;

        System.out.println("Informe a marcacao do seu odomnetro no inicio da jornada de trabalho e apos a marcacao no final: ");
        kmInicial = in.nextFloat();
        kmFinal = in.nextFloat();

        System.out.println("Agora informe a quantidade de combustivel gasto nessajornada: ");
        quantLitros = in.nextFloat();

        System.out.println("Por ultimo informe quanto você recebeu ao total dos pasageiros: ");
        totalRecebido = in.nextFloat();

        mediaConsumo = (kmFinal-kmInicial)/quantLitros;

        lucro = totalRecebido - (quantLitros*valorCombustivel);

        System.out.printf("Sua media de consumo foi de %.1f km/l\n e seulucro liquido foi de R$%.2f ", mediaConsumo, lucro);
        

        

        
    }
    
}
