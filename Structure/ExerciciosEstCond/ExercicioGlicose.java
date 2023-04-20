/* Fazer um programa para ler a quantidade de glicose
no sangue de uma pessoa e depois mostrar na tela a classificação desta glicose. 
REFERENCIA: Normal -> até 100mg/dl | Elevado -> Maior que 100 até 140mg/dl | Diabetes -> Maior de 140mg/dl */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioGlicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double qtdGlicose;
		
		System.out.print("Digite a medida da glicose: ");
		qtdGlicose = sc.nextDouble();
		
		if(qtdGlicose <= 100) {
			System.out.println("Classificação: normal");
		} else if (qtdGlicose <= 140) {
			System.out.println("Classificação: elevado");
		} else {
			System.out.println("Classificação: diabetes");
		}	
		
		sc.close();
	}

}
