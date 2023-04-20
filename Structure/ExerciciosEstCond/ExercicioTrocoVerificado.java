/* Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
valor restante. */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTrocoVerificado {

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
		
		/* FORMA OPICIONAL DE FAZER
		 * 
		 * if (precoUnitario * qtdComprada > dinheiroRecebido) {
		 * 	   double falta = precoUnitario * qtdComprada - dinheiroRecebido;
		 * 	   System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f\n", falta);
		 * } else 
		 * 	   troco = dinheiroRecebido - precoUnitario * qtdComprada;
		 * 	   System.out.printf("TROCO = %.2f", troco);
		 * */
		
		troco = dinheiroRecebido - (precoUnitario * qtdComprada);
		
		if (troco < 0) {
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f reais", Math.abs(troco));
		} else {
			System.out.printf("TROCO = %.2f", troco);
		}
		
		sc.close();
	}

}
