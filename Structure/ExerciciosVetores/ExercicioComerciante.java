/* Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
- lucro < 10%
- 10% ≤ lucro ≤ 20%
- lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total. */

package ExerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioComerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] names = new String[n];
		double[] purchasePrice = new double[n];
		double[] salePrice = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Produto %d:\n", i + 1);
			System.out.print("Nome: ");
			names[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			purchasePrice[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			salePrice[i] = sc.nextDouble();
			sc.nextLine();
		}
				
		int below10Percent = 0, between10And20Percent = 0, greaterThan20Percent = 0;
		double totalPurchase = 0.0, totalSale = 0.0;
		for (int i = 0; i < n; i++) {
			double profit = salePrice[i] - purchasePrice[i];
			profit /= purchasePrice[i];
			profit *= 100; 
			if (profit < 10) {
				below10Percent++;
			} else if (profit >= 10 && profit <= 20) {
				between10And20Percent++;
			} else {
				greaterThan20Percent++;
			}
			totalPurchase += purchasePrice[i];
			totalSale += salePrice[i];
		}
		double totalProfit = totalSale - totalPurchase;
		
		System.out.println("RELATORIO:");
		System.out.printf("Lucro abaixo de 10%%: %d\n", below10Percent);
		System.out.printf("Lucro entre 10%% e 20%%: %d\n", between10And20Percent);
		System.out.printf("Lucro acima de 20%%: %d\n", greaterThan20Percent);
		System.out.printf("Valor total de compra: %.2f\n", totalPurchase);
		System.out.printf("Valor total de venda: %.2f\n", totalSale);
		System.out.printf("Lucro total: %.2f", totalProfit);
		
		sc.close();
	}

}
