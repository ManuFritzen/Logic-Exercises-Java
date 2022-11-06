import java.util.Scanner;

public class L08CEx09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas que você quer ver do triângulo de Pascal:");
        int quantLinhas = in.nextInt();
        int v1[] = new int[quantLinhas + 1];
        int v2[] = new int[quantLinhas + 1 ];
        
        for(int i=0 ; i < v1.length ; i++){
            
            v2[i] = 0;
            v1[i] = 0;            
        }

        v2[1] = 1;
        int contador = 1;
        for(int r = 0; r<quantLinhas; r++){
            for(int i = 1; i<= contador; i++) {
                v1[i] = v2[i] + v2[i-1];
                System.out.print(v1[i] + " ");
            }
            for(int i = 0; i<v1.length;i++){
                v2[i] = v1[i];
            }
            System.out.println();
            contador++;
        }


    }
}
