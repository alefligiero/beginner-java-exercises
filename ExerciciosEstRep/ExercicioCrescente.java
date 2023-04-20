/* Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais.  */

package ExerciciosEstRep;

import java.util.Scanner;

public class ExercicioCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois números:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x > y) {
				System.out.println("DESCRESCENTE");
			} else {
				System.out.println("CRESCENTE");
			}
			
			System.out.println("Digite dois números:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
