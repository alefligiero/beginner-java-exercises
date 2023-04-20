/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
conforme exemplo */

package ExerciciosEstRep;

import java.util.Scanner;

public class ExercicioDentroFora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, x, dentro = 0, fora = 0;
		
		System.out.print("Quantos numeros você vai digitar: ");
		N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		sc.close();
	}

}
