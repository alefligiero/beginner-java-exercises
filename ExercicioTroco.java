/* Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente. */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTroco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario, dinheiroRecebido, troco;
		int qtdComprada;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		qtdComprada = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		troco = dinheiroRecebido - (precoUnitario * qtdComprada);
		
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();
	}
}
