/*Faça um programa que desenhe uma matriz 8 x 8, e que preencha ela com zeros. Apenas a
primeira posição deverá conter um traço. De acordo com a utilização do teclado, da forma que você
achar mais conveniente, escolha 4 teclas para você mover o traço uma posição, respectivamente,
para esquerda, para cima, para a direita e para baixo. Quando o movimento extrapolar os limites da
matriz, dê a volta nela e inicie pela outra extremidade. Você deve contar quantas interações o
usuário realizou, e escolher uma tecla para finalizar o programa, que deverá ser informada
inicialmente para o usuário. */

import java.util.Scanner;

public class ListaTrabalhoEx04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        char[][] matriz = new char[8][8];
        char traco = (char) (45);
        char zero = (char) (48);
        int posicaoTracoLinha = 0;
        int posicaoTracoColuna = 0;
        int contadorMovimento = 0;
        boolean jogar = true;

        for ( int i = 0 ; i < 8 ; i++){
            for ( int j = 0 ; j < 8 ; j++){
                if(i == 0 && j ==0){
                    matriz[posicaoTracoLinha][posicaoTracoColuna] = traco;
                } else {
                    matriz[i][j] = zero;
                } 
                System.out.print(matriz[i][j] + "  ");            
            }
            System.out.println();                       
        }


        while (jogar){                   

            System.out.println("para qual lado você quer movimentar o traço?? Obs: use W para cima, S para baixo, A para a esquerda, D para a direita e T para dar Tchau. ");
            char letraDigitada = in.next().toUpperCase().charAt(0);

            switch (letraDigitada){
                case 'W':
                    if(posicaoTracoLinha == 0){
                        posicaoTracoLinha = posicaoTracoLinha + 7;
                    } else{
                        posicaoTracoLinha = posicaoTracoLinha - 1;                     
                    }                    
                    break;
                    
                case 'S':
                    if(posicaoTracoLinha==7){
                        posicaoTracoLinha = posicaoTracoLinha - 7;
                    } else {
                        posicaoTracoLinha = posicaoTracoLinha + 1;
                    }      
                    break;

                case 'D':
                    if(posicaoTracoColuna==7){
                        posicaoTracoColuna = posicaoTracoColuna -7;
                    } else {
                        posicaoTracoColuna = posicaoTracoColuna + 1;
                    }                         
                    break;
                            
                case 'A':
                    if(posicaoTracoColuna==0){
                        posicaoTracoColuna = posicaoTracoColuna + 7;
                    } else{
                        posicaoTracoColuna = posicaoTracoColuna - 1;
                    }
                    break;
                case 'T':                   
                    jogar = false;
                    break;                              
            }
            
            if(!jogar) {
                System.out.println("TCHAAAAUUU!!");
            }else if(letraDigitada == 'A' || letraDigitada == 'W' || letraDigitada == 'D' || letraDigitada == 'S' ) {
                contadorMovimento++;
                for ( int i = 0 ; i < 8 ; i++){
                    for ( int j = 0 ; j < 8 ; j++){
                        matriz[i][j] = zero;
                        matriz[posicaoTracoLinha][posicaoTracoColuna] = traco;      
                        System.out.print(matriz[i][j] + "  ");      
                    } 
                    System.out.println();                      
                }
                System.out.println("Movimentos: " + contadorMovimento);
                
            } else {                
                System.out.println("Comando não identificado!");
            }            
        }
    }
    
}
