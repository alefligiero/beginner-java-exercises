/* Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais. */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioConsumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia;
		double combustivelGasto, consumoMedio;
		
		System.out.print("Distância percorrida: ");
		distancia = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		consumoMedio = distancia / combustivelGasto;
		
		System.out.printf("Consumo médio: %.3f", consumoMedio);
		
		sc.close();
	}

}
