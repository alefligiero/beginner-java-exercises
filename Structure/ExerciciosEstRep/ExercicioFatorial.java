/* Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
fatorial de N. */

package ExerciciosEstRep;

import java.util.Scanner;

public class ExercicioFatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, fatorial = 1;
		
		System.out.print("Digite o valor de N: ");
		N = sc.nextInt();
		
		
		for (int i = 1; i <= N; i++) {
			fatorial *= i;
		}
		
		System.out.println("FATORIAL = " + fatorial);
		
		sc.close();
	}

}
