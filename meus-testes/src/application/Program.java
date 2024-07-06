package application;

import java.util.*;
import entities.Ages;

/*
 * Objetivo: 
 * entender melhor como os dados sao coletados e armazenados
 * utilizando-se construtores e ArrayList, a diferenca em como sao
 * armazenados e a diferenca em como sao chamados e impressos,
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Ages> ages = new ArrayList<>();
		Ages age = new Ages();

		System.out.println("How many personal data will be typed?");
		int pd = sc.nextInt();

		// 01. COLLECTING DATA
		for (int i = 0; i < pd; i++) {
			System.out.println();
			System.out.println("Type the name and birth year of the person number " + (i + 1) + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Year: ");
			Integer birthYear = sc.nextInt();

			// use the constructor to set name and birthYear
			age = new Ages(name, birthYear);

			// use the ArrayList method add() to add data to the right index
			ages.add(new Ages(name, birthYear));
		}

		System.out.println();

		// 02. PRINTING DATA
		for (int i = 0; i < pd; i++) {
			System.out.println(ages.get(i)); // retrieve from toString()
			//System.out.println(age); // retrieve from toString()
			//System.out.println(age.getName()); // retrieve from name
		}

		sc.close();
	}

}
