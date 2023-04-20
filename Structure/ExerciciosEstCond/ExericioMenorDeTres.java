/* Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
números lidos. Em caso de empate, mostrar apenas uma vez. */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExericioMenorDeTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Primeiro valor: ");
		int x = sc.nextInt();
		
		System.out.print("Segundo valor: ");
		int y = sc.nextInt();
		
		System.out.print("Terceiro valor: ");
		int z = sc.nextInt();
		
		if (x < y && x < z) {
			System.out.println("MENOR = " + x);
		} else if (y < z) {
			System.out.println("MENOR = " + y);
		} else {
			System.out.println("MENOR = " + z);
		}
		
		sc.close();
	}

}
