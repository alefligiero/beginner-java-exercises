/* Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
pela soma dos pesos. */

package ExerciciosEstRep;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double x, y, z, media;
		
		System.out.print("Quantos casos você vai digitar? ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite tres numeros:");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			media = ((x * 2) + (y * 3) + (z * 5)) / 10.0;
			
			System.out.printf("MEDIA = %.1f\n", media);
		}
		
		sc.close();
	}

}
