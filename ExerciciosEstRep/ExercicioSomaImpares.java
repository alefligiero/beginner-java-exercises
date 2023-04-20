/* Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles.  */

package ExerciciosEstRep;

import java.util.Scanner;

public class ExercicioSomaImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma = 0, aux;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		if (x > y) {
			aux = x;
			x = y;
			y = aux;
		}
		
		for (int i = x+1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();
	}

}
