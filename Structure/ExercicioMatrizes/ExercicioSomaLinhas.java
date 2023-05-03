/* Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado. */

package ExercicioMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaLinhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.printf("Digite os elementos da %da. linha: \n", i+1);
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] vetSoma = new double[mat.length];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				vetSoma[i] += mat[i][j];
			}
		}
		
		System.out.println("VETOR GERADO:");
		
		for (int i = 0; i < vetSoma.length; i++) {
			System.out.println(vetSoma[i]);
		}
		
		sc.close();
	}

}
