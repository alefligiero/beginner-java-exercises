/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

package ExerciciosVetores;

import java.util.Scanner;

public class ExercicioNumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros pares voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		int qtdPairs = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
				qtdPairs++;
			}
		}
		
		System.out.print("\n\nQUANTIDADE DE PARES = " + qtdPairs);
		
		sc.close();
		
	}

}
