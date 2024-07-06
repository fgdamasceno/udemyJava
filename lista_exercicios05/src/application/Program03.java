package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program03 {

	public static void main(String[] args) { // EXERCICIO 02

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(x.employee());
		
		System.out.printf("%nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage); 

	}

}
