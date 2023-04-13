/* Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
uma mensagem explicativa, conforme exemplo. */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeFunc;
		double valorHora, pagamento;
		int horasTrabalhadas;
		
		System.out.print("Nome: ");
		nomeFunc = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valorHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		pagamento = valorHora * horasTrabalhadas;
		
		System.out.printf("O pagamento para %s deve ser %.2f", nomeFunc, pagamento);
		
		sc.close();
	}

}
