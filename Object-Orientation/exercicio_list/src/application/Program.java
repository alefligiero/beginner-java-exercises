package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:\n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.print("This id is already in use. Enter another id: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee e = new Employee(id, name, salary);

			employees.add(e);
		}

		System.out.print("\nEnter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee e = employees.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		if (e != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			e.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}

		System.out.println("\nList of employees:");

		for (Employee emp : employees) {
			System.out.println(emp);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> employees, int id) {
		Employee emp = employees.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		return emp != null;
	}
}