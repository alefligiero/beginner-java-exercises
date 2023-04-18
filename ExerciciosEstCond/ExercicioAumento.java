/* Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto
cada pessoa ganha, conforme tabela ao lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar
qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a porcentagem de aumento. 
REFERENCIA: Até 1000.00 -> 20% | Acima de 1000.00 até 3000.00 -> 15% | Acima de 3000.00 até 8000.00 -> 10% |
Acima de 8000.00 -> 5% */

package ExerciciosEstCond;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, aumento;
		
		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000.00) {
			aumento = salario * 0.2;
			salario = salario + aumento;
			System.out.printf("Novo salario: R$ %.2f\n", salario);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem: 20 %");
			
		} else if (salario <= 3000.00) {
			aumento = salario * 0.15;
			salario = salario + aumento;
			System.out.printf("Novo salario: R$ %.2f\n", salario);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem: 15 %");
		} else if (salario <= 8000.00) {
			aumento = salario * 0.1;
			salario = salario + aumento;
			System.out.printf("Novo salario: R$ %.2f\n", salario);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem: 10 %");
		} else {
			aumento = salario * 0.05;
			salario = salario + aumento;
			System.out.printf("Novo salario: R$ %.2f\n", salario);
			System.out.printf("Aumento = R$ %.2f\n", aumento);
			System.out.println("Porcentagem: 5 %");
		}
		
		
		sc.close();
	}

}
