/*. Escreva um programa que faça a leitura da idade de 2 homens e 2 mulheres
(supondo que as idades do mesmo sexo serão diferentes). O programa deve fazer o
somatório da idade do homem mais velho com a idade da mulher mais nova e o
produto da idade do homem mais novo pela idade da mulher mais velha. Ao final
você deve imprimir os resultados, e cada uma das idades digitadas: mulher mais
nova, mulher mais velha, homem mais novo e homem mais velho.
 */
import java.util.Scanner;

public class L02Ex24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mulher1, mulher2, homem1, homem2, soma, mult;

        System.out.println("Informe a idade de duas mulheres que tenham iddes diferentes");
        mulher1 = in.nextInt();
        mulher2 = in.nextInt();
        System.out.println("Informe a idade de dois homens que tenham iddes diferentes");
        homem1 = in.nextInt();
        homem2 = in.nextInt();


        if(homem1>homem2 && mulher1>mulher2){
            soma = homem1 + mulher2;
            mult = homem2*mulher1;
            System.out.println("Mulher mais velha:" + mulher1 + "\nMulher mais nova:" + mulher2 + 
            "\nHomem mais velho:" + homem1 + "\n Homem mais novo:" + homem2 + "\nsoma: " + soma + 
            "\nmultiplicacao: " +mult);
        } else if(homem1<homem2 && mulher1>mulher2){
            soma = homem2+mulher2;
            mult = homem1*mulher1;
            System.out.println("Mulher mais velha:" + mulher1 + "\nMulher mais nova:" + mulher2 + 
            "\nHomem mais velho:" + homem2 + "\n Homem mais novo:" + homem1 + "\nsoma: " + soma + 
            "\nmultiplicacao: " +mult);
        } else if(homem1>homem2 && mulher1<mulher2){
            soma = homem1+mulher1;
            mult = homem2*mulher2;System.out.println("Mulher mais velha:" + mulher2 + 
            "\nMulher mais nova:" + mulher1 + "\nHomem mais velho:" + homem1 + 
            "\n Homem mais novo:" + homem2 + "\nsoma: " + soma + "\nmultiplicacao: " + mult);
        } else {
            soma = homem2+mulher1;
            mult = homem1*mulher2;System.out.println("Mulher mais velha:" + mulher2 + 
            "\nMulher mais nova:" + mulher1 + 
            "\nHomem mais velho:" + homem2 + "\n Homem mais novo:" + homem1 + "\nsoma: " + soma + 
            "\nmultiplicacao: " +mult);
        }





    

    }
    
}
