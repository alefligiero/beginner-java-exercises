/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[n];
		double[] notes1 = new double[n];
		double[] notes2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			names[i] = sc.nextLine();
			notes1[i] = sc.nextDouble();
			notes2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < n; i++) {
			double avg = (notes1[i] + notes2[i]) / 2;
			if (avg >= 6.0) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}

}
