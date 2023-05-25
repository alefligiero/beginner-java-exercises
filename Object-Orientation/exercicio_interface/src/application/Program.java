package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer contractNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		Double contractTotalValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		Integer installments = sc.nextInt();

		Contract contract = new Contract(contractNumber, contractDate, contractTotalValue);

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, installments);

		System.out.println("Installments:");

		for (Installment installment : contract.getInstallments()) {
			System.out.printf("%s - %.2f\n", installment.getDueDate().format(fmt), installment.getAmount());
		}

		sc.close();
	}

}
