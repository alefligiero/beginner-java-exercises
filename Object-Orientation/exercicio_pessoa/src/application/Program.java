package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			switch(ch) {
			case 'i':
				System.out.print("Heath expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				taxPayers.add(new Company(name, anualIncome, numberEmployees));
				break;
			default:
				System.out.println("Opção inválida!");
				System.exit(1);
			}
		}
		Double totalTaxes = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer t : taxPayers) {
			System.out.printf("%s: $ %.2f\n", t.getName(), t.tax());
			totalTaxes += t.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		sc.close();
	}

}
