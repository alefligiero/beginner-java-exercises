package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the path of the file to be read: ");
		String sourceFilePath = sc.nextLine();
		
		File sourceFolderPath = new File(sourceFilePath);
	
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))) {
			String line = br.readLine();
			while (line != null) {
				String[] parametersProduct = line.split(",");
				products.add(new Product(parametersProduct[0], Double.parseDouble(parametersProduct[1]), Integer.parseInt(parametersProduct[2])));
				line = br.readLine();
			}
			
			String targetFilePath = sourceFolderPath.getParent() + "/summary.csv";
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {
				for (Product p : products) {
					bw.write(p.getName() + "," + String.format("%.2f", p.getTotalPrice()));
					bw.newLine();
				}
				System.out.println("The file has been created in: " + targetFilePath);
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
