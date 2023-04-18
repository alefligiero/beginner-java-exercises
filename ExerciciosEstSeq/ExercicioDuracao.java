/* Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos. */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDuracao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao, minutos, segundos, horas, resto;
		
		System.out.print("Digite a duracao em segundos: ");
		duracao = sc.nextInt();
		
		horas = duracao / 3600;
		resto = duracao % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
