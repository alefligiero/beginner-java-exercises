/* Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes: ler dois números e
imprimir o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem
“DIVISAO IMPOSSIVEL”. */

package ExerciciosEstRep;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDivisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, x, y;
		double resultado;
		
		System.out.print("Quantos casos você vai digitar? ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Entre com o numerador: ");
			x = sc.nextInt();
			
			System.out.print("Entre com o denominador: ");
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
				resultado = (double) x / y;
				System.out.printf("DIVISAO = %.2f\n", resultado);
			}
		}
		
		
		sc.close();
	}

}
