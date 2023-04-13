/* Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIdades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String p1, p2;
		int i1, i2;
		double idadeMedia;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		p1 = sc.nextLine();
		System.out.print("Idade: ");
		i1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.print("Nome: ");
		p2 = sc.nextLine();
		System.out.print("Idade: ");
		i2 = sc.nextInt();
		
		idadeMedia = (i1 + i2)/2.0;
		System.out.printf("A idade média de %s e %s é de %.1f anos", p1, p2, idadeMedia);
		
		sc.close();
	}

}
