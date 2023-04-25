/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
		}
		
		double higherValue = array[0];
		int posHigherValue = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > higherValue) {
				higherValue = array[i];
				posHigherValue = i;
			}
		}
		
		System.out.println("\nMAIOR VALOR = " + higherValue);
		System.out.println("POSICAO DO MAIOR VALOR = " + posHigherValue);
		
		sc.close();
	}

}
