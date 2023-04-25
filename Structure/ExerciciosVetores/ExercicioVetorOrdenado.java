/* Activity developed by me! */

package ExerciciosVetores;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioVetorOrdenado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%do numero: ", i + 1);
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.print("Numeros digitados em ordem crescente: " + Arrays.toString(array));

		sc.close();
	}

}
