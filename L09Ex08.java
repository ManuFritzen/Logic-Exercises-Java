import java. util.Scanner;

public class L09Ex08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] matriz = {
            {8, 0, 7},
            {4, 5, 6},
            {3, 10, 2},
        };

        int soma = 0;

        for(int j = 0 ; j < 3 ; j++){
            soma = soma + matriz[0][j];
        }

        int somaCol1 = 0;
        int somaCol2 = 0;
        int somaCol3 = 0;
        boolean quadradoMagico = true;

        if(quadradoMagico){

            for(int i=0 ; i<3 ; i++){
                int somaLinha = 0;            
                int somaDiagonal = 0;

                somaCol1 += matriz[i][0];
                somaCol2 += matriz[i][1];
                somaCol3 += matriz[i][2];

                for(int j = 0; j < 3; j++) { 
                    somaLinha += matriz[i][j];

                    if(i==j){
                        somaDiagonal += matriz[i][j];
                    }
                }     

                if(somaLinha != soma && somaCol1 != soma && somaCol2 != soma && somaCol3 != soma && somaDiagonal != soma){
                    System.out.println("Não é um quadrado mágico!");
                    quadradoMagico = false;

                    break;
                }
            }

            if(quadradoMagico){
                System.out.println("Essa matriz é um quadrado mágico");
            }

        }
    }
}
