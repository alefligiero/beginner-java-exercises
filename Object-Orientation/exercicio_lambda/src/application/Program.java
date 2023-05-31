package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		Double salaryFilter = sc.nextDouble();

		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employee = br.readLine();
			while (employee != null) {
				String[] employeeData = employee.split(",");
				String name = employeeData[0];
				String email = employeeData[1];
				Double salary = Double.parseDouble(employeeData[2]);

				employees.add(new Employee(name, email, salary));

				employee = br.readLine();
			}
			System.out.println("Email of people whose salary is more than 2000.00:");
			
			List<String> emails = employees.stream()
					.filter(e -> e.getSalary() > salaryFilter)
					.map(e -> e.getEmail())
					.sorted((s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			Double sum = employees.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
