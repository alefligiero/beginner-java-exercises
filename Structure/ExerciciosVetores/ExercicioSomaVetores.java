/* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

package ExerciciosVetores;

import java.util.Scanner;

public class ExercicioSomaVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] arrayA = new int[n];
		int[] arrayB = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			arrayA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			arrayB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		int[] arrayC = new int[n];
		for (int i = 0; i < n; i++) {
			arrayC[i] = arrayA[i] + arrayB[i];
			System.out.println(arrayC[i]);
		}
		
		sc.close();
		
	}

}
