/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
			System.out.print("Altura: ");
			heights[i] = sc.nextDouble();
		}
		
		double sumHeights = 0.0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			sumHeights += heights[i];
			if (ages[i] < 16) {
				count++;
			}
		}
		
		double avgHeight = sumHeights / n;
		System.out.printf("\nAltura média: %.2f\n", avgHeight);
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((double)count / n) * 100);
		
		for (int i = 0; i < n; i++) {
			if (ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
		
	}

}
