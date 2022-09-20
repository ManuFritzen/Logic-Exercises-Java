/*Ler três valores (considere que não serão informados valores iguais) e escrevê-los
em ordem crescente. */

import java.util.Scanner;

public class L03Ex04 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Informe tres numeros inteiros: ");
        v1 = in.nextInt();
        v2 = in.nextInt();
        v3 = in.nextInt();

        if(v1<v2&&v2<v3){
            System.out.println("Ordem crescente: " + v1 + "; " + v2 + "; " + v3);
        } else if(v1<v3&&v3<v2){
            System.out.println("Ordem crescente: " + v1 + "; " + v3 + "; " + v2);
        } else if(v2<v1&&v1<v3){
            System.out.println("Ordem crescente: " + v2 + "; " + v1 + "; " + v3);
        } else if(v2<v3&&v3<v1){
            System.out.println("Ordem crescente: " + v2 + "; " + v3 + "; " + v1);
        } else if(v3<v1&&v1<v2){
            System.out.println("Ordem crescente: " + v3 + "; " + v1 + "; " + v2);
        } else {
            System.out.println("Ordem crescente: " + v3 + "; " + v2 + "; " + v1);
        } 
    }
    
}
