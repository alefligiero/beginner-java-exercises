/* Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
números podem ser digitados em qualquer ordem. */

package ExerciciosEstCond;

import java.util.Scanner;

public class ExercicioMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite dois números inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
	}

}
