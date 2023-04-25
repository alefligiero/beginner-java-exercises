/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

package ExerciciosVetores;

import java.util.Scanner;

public class ExercicioMaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}
		
		int higherAge = ages[0];
		int posHigherAge = 0;
		for (int i = 0; i < n; i++) {
			if (ages[i] > higherAge) {
				higherAge = ages[i];
				posHigherAge = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + names[posHigherAge]);
		
		sc.close();
		
	}

}
