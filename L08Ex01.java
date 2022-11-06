/*Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura. */

import java.util.Scanner;

public class L08Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de números na sequência");
        int quantNumeros = in.nextInt();
        int sequencia[] = new int[quantNumeros];

        System.out.println("Preencha a sequência:");
        for(int i = 0; i < quantNumeros; i++){
            sequencia[i]=in.nextInt();
        }

        System.out.println("Sua sequência inversa fica assim:");
        for(int i = sequencia.length-1; i>=0; i--) {
            System.out.print(sequencia[i] + " ");
        }
        System.out.println();



    }
}
