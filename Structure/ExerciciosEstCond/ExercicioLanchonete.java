/* Uma lanchonete possui vários produtos. Cada produto possui um código
e um preço. Você deve fazer um programa para ler o código e a
quantidade comprada de um produto (suponha um código válido), e daí
informar qual o valor a ser pago, com duas casas decimais. 
REFERENCIA: cod.1 = 5 reais | cod.2 = 3.5 reais | cod.3 = 4.8 reais
cod.4 = 8.9 reais | cod.5 = 7.32 reais */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codProd, qtdComprada;
		double valor;
		
		System.out.print("Código do produto comprado: ");
		codProd = sc.nextInt();
		
		if(codProd > 5) {
			System.out.println("Código inválido!");
		} else {
			System.out.print("Quantidade comprada: ");
			qtdComprada = sc.nextInt();
			
			System.out.print("Valor a pagar: R$ ");
			
			if (codProd == 1) {
				valor = 5.00 * qtdComprada;
				System.out.printf("%.2f", valor);
			} else if (codProd == 2) {
				valor = 3.50 * qtdComprada;
				System.out.printf("%.2f", valor);
			} else if (codProd == 3) {
				valor = 4.80 * qtdComprada;
				System.out.printf("%.2f", valor);
			} else if (codProd == 4) {
				valor = 8.90 * qtdComprada;
				System.out.printf("%.2f", valor);
			} else if (codProd == 5) {
				valor = 7.32 * qtdComprada;
				System.out.printf("%.2f", valor);
			}
		}
		
		sc.close();
	}

}
