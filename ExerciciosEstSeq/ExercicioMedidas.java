/* Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaQuadrado, areaTriangulo, areaTrapezio;
		
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite a medida C: ");
		c = sc.nextDouble();
		
		areaQuadrado = a * a;
		System.out.printf("AREA DO QUADRADO = %.4f\n", areaQuadrado);
		
		areaTriangulo = (a* b) / 2.0;
		System.out.printf("AREA DO TRIANGULO = %.4f\n", areaTriangulo);
		
		areaTrapezio = ((a + b) * c) / 2.0;
		System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaTrapezio);
		
		sc.close();
	}

}
