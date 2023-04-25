/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package ExerciciosVetores;

import java.util.Scanner;

public class ExercicioNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				System.out.println(array[i]);
			}
		}
		
		sc.close();
	}

}
