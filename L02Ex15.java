/* Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
dia e terminar no dia seguinte
 */
import java.util.Scanner;


public class L02Ex15 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);

        int horasInicio, horasFim, minutosInicio, minutosFim, tempoHoras, tempoMinutos;

        System.out.println("Infome as horas e minutos que o jogo de xadrez começou (apenas separado por um espaço):");
        horasInicio = in.nextInt();
        minutosInicio = in.nextInt();

        System.out.println("Agora infome as horas e minutos que o jogo de xadrez finalizou (apenas separado por um espaço):");
        horasFim = in.nextInt();
        minutosFim = in.nextInt();       

        if(horasFim<horasInicio){
            tempoHoras = 24-horasInicio+horasFim;
        } else {
            tempoHoras = horasFim-horasInicio;
        }

        if(minutosFim<minutosInicio){
            tempoMinutos = 60-minutosInicio+minutosFim;
        } else {
            tempoMinutos = minutosFim-minutosInicio;
        }

        System.out.println("O jogo de jadrez durou: " + tempoHoras + ":" + tempoMinutos);

    }
    
}
