/* Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
organizar os experimentos de um laboratório do qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto. */

package ExerciciosEstRep;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExperiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, totalCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0, qtdCobaias;
		char tipoCobaia;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtdCobaias = sc.nextInt();
			totalCobaias += qtdCobaias;
			
			System.out.print("Tipo de Cobaia: ");
			tipoCobaia = sc.next().charAt(0);
			
			switch (tipoCobaia) {
			case 'C':
				totalCoelhos += qtdCobaias;
				break;
			case 'R':
				totalRatos += qtdCobaias;
				break;
			case 'S':
				totalSapos += qtdCobaias;
				break;
			}
		}
		
		System.out.println("\nRELATORIO FINAL:");
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);
		System.out.printf("Percentual de coelhos: %.2f\n" , (((double) totalCoelhos * 100) / totalCobaias));
		System.out.printf("Percentual de ratos: %.2f\n" , (((double)totalRatos * 100) / totalCobaias));
		System.out.printf("Percentual de sapos: %.2f" , (((double)totalSapos* 100) / totalCobaias));
		
		sc.close();
	}

}
