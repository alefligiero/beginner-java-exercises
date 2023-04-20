/* Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".  */

package ExerciciosEstRep;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaIdades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, i = 0;
		double media, soma = 0;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (idade > 0) {
				soma += idade;
				i++;
				idade = sc.nextInt();
			}
			media = soma / i;
			System.out.printf("MEDIA %.2f\n", media);
		}
		
		sc.close();
	}

}
