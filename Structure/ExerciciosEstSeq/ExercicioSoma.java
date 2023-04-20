/* Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
números. */

import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
