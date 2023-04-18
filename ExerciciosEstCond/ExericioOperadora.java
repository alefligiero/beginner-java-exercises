/* Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago. */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExericioOperadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		
		/* FORMA OPCIONAL DE FAZER:
		 * double valor = 50.0;
		 * 
		 * if (minutos > 100) {
		 *     valor = valor + (minutos - 100) * 2.0;
		 * }
		 * 
		 * System.out.printf("Valor a pagar: %.2f\n", valor);
		 * */
		
		if (minutos > 100) {
			System.out.printf("Valor a pagar: R$ %.2f\n", 50 + ((minutos - 100) * 2));
		} else {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		
		sc.close();
	}

}
