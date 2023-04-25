/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		double avg = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		avg = sum / array.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] < avg) {
				System.out.printf("%.1f\n", array[i]);
			}
		}
		
		sc.close();
	}

}
