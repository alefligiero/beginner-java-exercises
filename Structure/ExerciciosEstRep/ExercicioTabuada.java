/* Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo. */

package ExerciciosEstRep;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
	
		System.out.print("Deseja a tabuada para qual valor: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
		sc.close();
	}

}
