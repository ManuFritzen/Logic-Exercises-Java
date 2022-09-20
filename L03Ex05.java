/*Ler três valores (A, B e C) representando as medidas dos lados de um triângulo e
escrever se formam ou não um triângulo. Observação: para formar um triângulo, o
valor de cada lado deve ser menor que a soma dos outros dois lados.
 */

 import java.util.Scanner;


public class L03Ex05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float ladoA, ladoB, ladoC;

        System.out.println("Informe as tres medidas dos lados do triangulo: ");
        ladoA = in.nextFloat();
        ladoB = in.nextFloat();
        ladoC = in.nextFloat();

        if(ladoA<ladoB+ladoC && ladoB<ladoA+ladoC && ladoC<ladoA+ladoB){
            System.out.println("forma um triangulo");
        } else{
            System.out.println("nao forma um triangulo");
        }


    }
    
}
