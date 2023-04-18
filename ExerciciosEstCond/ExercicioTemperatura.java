/* Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
duas casas decimais. */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTemperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double farenheight, celsius;
		char escala;

		System.out.print("Você vai digitar a temperatura em qual escala (C/F)? ");
		escala = sc.next().charAt(0);

		if (escala == 'F' || escala == 'f') {
			System.out.print("Digite a temperatura em Farenheight: ");
			farenheight = sc.nextDouble();

			celsius = 5.0 / 9.0 * (farenheight - 32.0);

			System.out.printf("Temperatura equivalente em celsius: %.2f", celsius);
		} else if (escala == 'C' || escala == 'c') {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();

			farenheight = celsius * 1.8 + 32.0;

			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", farenheight);
		} else {
			System.out.println("Digite somente C ou F!");
		}

		sc.close();
	}

}
