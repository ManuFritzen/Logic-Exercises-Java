/* Ler o nome de dois times e o número de gols marcados na partida (para cada time).
Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
palavra EMPATE.
 */

 import java.util.Scanner;


public class L03Ex06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String time1, time2;
        int golTime1, golTime2;

        System.out.println("Informe o nome dos times da partida e na mesma ordem, informe quantos gols cada um fez: ");
        time1 = in.next();
        time2 = in.next();
        golTime1 = in.nextInt();
        golTime2 = in.nextInt();

        if(golTime1>golTime2){
            System.out.println("O vencedor foi o " + time1);
        } else if(golTime2>golTime1){
            System.out.println("O vencedor foi o " + time2);
        } else {
            System.out.println("EMPATE");
        }


    }
    
}
