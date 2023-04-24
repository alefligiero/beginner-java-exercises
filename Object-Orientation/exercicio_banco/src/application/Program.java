package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc = null;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		char option;
		
		do {
			System.out.print("Is there an initial deposit (y/n)? ");
			option = sc.next().charAt(0);
			
			switch (option) {
			case 'y':
				System.out.print("Enter initial deposit value: ");
				double initialDeposit = sc.nextDouble();
				
				acc = new Account(accountNumber, holder, initialDeposit);
				break;
			case 'n':
				acc = new Account(accountNumber, holder);
				break;
			default:
				System.out.println("Invalid option! Try Again.");
			}
		} while (option != 'y' && option != 'n');
		
		System.out.println();
		System.out.println("Account data:\n" + acc);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.depositMoney(deposit);
		System.out.println("Updated account data:\n" + acc);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withDrawMoney(withdraw);
		System.out.println("Updated account data:\n" + acc);

		sc.close();
	}

}
