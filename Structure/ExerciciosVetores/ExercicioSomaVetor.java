/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {

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
		
		System.out.print("VALORES = ");
		
		double sum = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
		}
		
		System.out.printf("\nSOMA = %.2f\n", sum);
		
		double avg = sum / array.length;
		System.out.printf("MEDIA = %.2f", avg);
		
		sc.close();
	}

}
