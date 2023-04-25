/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array[i] = sc.nextInt();
		}
		
		int qtdPairs = 0, sumPairs = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sumPairs += array[i];
				qtdPairs++;
			}
		}
		
		if (qtdPairs > 0) {
			double avg = (double) sumPairs / qtdPairs;
			System.out.printf("MEDIA DOS PARES = %.1f\n", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
