package exercicio_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> registers = new LinkedHashMap<>();
		Integer totalVotes = 0;

		System.out.print("Enter file full path: ");
		String sourceFilePath = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				if (registers.containsKey(name)) {
					totalVotes = registers.get(name);
					registers.put(fields[0], votes + totalVotes);
				} else {
					registers.put(fields[0], votes);
				}
				line = br.readLine();
			}
			for (String key : registers.keySet()) {
				System.out.println(key + ": " + registers.get(key));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
