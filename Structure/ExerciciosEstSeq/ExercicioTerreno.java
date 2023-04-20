/* Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo. */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTerreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura;
		double comprimento;
		double vMetroQuadrado;
		double areaTerreno;
		double precoTerreno;

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		vMetroQuadrado = sc.nextDouble();

		areaTerreno = largura * comprimento;
		precoTerreno = areaTerreno * vMetroQuadrado;

		System.out.printf("Area do terreno = %.2f\n", areaTerreno);
		System.out.printf("Preco do terreno = %.2f\n", precoTerreno);

		sc.close();
	}

}
