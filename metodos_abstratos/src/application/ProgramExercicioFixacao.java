package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

public class ProgramExercicioFixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double income = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expeditures: ");
				double exp = sc.nextDouble();
				list.add(new Individual(name, income, exp));
			}
			else {
				System.out.print("Number of employees: ");
				int emp = sc.nextInt();
				list.add(new Company(name, income, emp));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer payer : list) {
			System.out.printf("%s: $ %.2f%n", payer.getName(), payer.taxCalculator());
		}
		
		System.out.println();
		double totalTax = 0.0;
		for (TaxPayer tax : list) {
			totalTax += tax.taxCalculator();
		}
		System.out.printf("TOTAL TAXES: $ %.2f ", totalTax);
		
		
		sc.close();
	}

}
