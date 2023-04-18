/* No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
foi a maior. */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double d1, d2, d3;
		
		System.out.println("Digite as tres distancias:");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		d3 = sc.nextDouble();
		
		System.out.print("MAIOR DISTANCIA: ");
		
		if (d1 > d2 && d1 > d3) {
			System.out.printf("%.2f", d1);
		} else if (d2 > d3) {
			System.out.printf("%.2f", d2);
		} else {
			System.out.printf("%.2f", d3);
		}
		
		sc.close();
	}

}
