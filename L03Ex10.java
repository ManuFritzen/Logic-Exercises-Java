/* 
Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa, construa um algoritmo que calcule e imprima seu peso
ideal, utilizando as seguintes fórmulas:
- para homens : (72.7 * h) – 58
- para mulheres : (62.1 * h) – 44.7
Observação: Altura = h (na fórmula acima).
 */

 import java.util.Scanner;

public class L03Ex10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float altura, pesoIdealF, pesoIdealM;
        char sexo;

        System.out.println("Informe sua altura e seu sexo (f para feminino e m para masculino) nesta ordem:");
        altura = in.nextFloat();
        sexo = in.next().charAt(0);

        pesoIdealF = (62.1f * altura) - 44.7f;
        pesoIdealM = (72.7f * altura) - 58f;

        if(sexo == 'f'){
            System.out.println("O seu peso ideal é: " + pesoIdealF);
        }else if(sexo == 'm'){
            System.out.println("O seu peso ideal é: " + pesoIdealM);
        } else {
            System.out.println("Siga as orientações da forma correta!");
        }


        
    }
    
}
