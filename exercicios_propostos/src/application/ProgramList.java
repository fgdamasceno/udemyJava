package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> employee = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			employee.add(new Employee(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		System.out.print("Enter the percentage: ");
		double increasePercentage = sc.nextDouble();

		for (Employee e : employee) {
			if (e.getId() == id) {
				e.increaseSalary(increasePercentage);
			}
			else {
				System.out.println("This id does not exist");
			}
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : employee) {
			System.out.println(e);
		}

		sc.close();
	}

}
