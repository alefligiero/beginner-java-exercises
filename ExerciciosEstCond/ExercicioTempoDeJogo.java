/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas. */

package ExerciciosEstCond;

import java.util.Scanner;

public class ExercicioTempoDeJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
		
		System.out.print("O JOGO DUROU ");
		
		if (horaInicial < horaFinal){
			duracao = horaFinal - horaInicial;
			System.out.printf("%d HORA(S)", duracao);
		} else {
			duracao = 24 - (horaInicial - horaFinal);
			System.out.printf("%d HORA(S)", duracao);
		}

		sc.close();
	}

}
