/* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDadosPessoais {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] heights = new double[n];
		char[] genders = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			heights[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			genders[i] = sc.next().charAt(0);
		}
		
		double higherHeigth = heights[0];
		double lowerHeigth = heights[0];
		double sumHeightWomen = 0.0;
		double avgHeightWomen = 0.0;
		int amountMen = 0;
		int amountWomen = 0;
		for (int i = 0; i < n; i++) {
			if (heights[i] > higherHeigth) {
				higherHeigth = heights[i];
			}
			if (heights[i] < lowerHeigth) {
				lowerHeigth = heights[i];
			}
			if (genders[i] == 'F') {
				sumHeightWomen += heights[i];
				amountWomen++;
			}
			if (genders[i] == 'M') {
				amountMen++;
			}
			
		}
		
		avgHeightWomen = sumHeightWomen / amountWomen;
		
		System.out.printf("Menor altura = %.2f\n", lowerHeigth);
		System.out.printf("Maior altura = %.2f\n", higherHeigth);
		System.out.printf("Media das altuas das mulheres = %.2f\n", avgHeightWomen);
		System.out.println("Numero de homens = " + amountMen);
		
		sc.close();
	}

}
