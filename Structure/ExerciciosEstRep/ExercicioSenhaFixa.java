/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
encerrado. Considere que a senha correta é o valor 2002.  */

package ExerciciosEstRep;

import java.util.Scanner;

public class ExercicioSenhaFixa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002, entrada;
		
		System.out.print("Digite a senha: ");
		entrada = sc.nextInt();

		while (entrada != senha) {
			System.out.print("Senha Invalida! Tente novamente: ");
			entrada = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
