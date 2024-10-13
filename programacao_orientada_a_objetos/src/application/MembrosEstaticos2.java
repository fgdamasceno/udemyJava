package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorEstatico;

public class MembrosEstaticos2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorEstatico.circumference(radius);
		
		double v = CalculatorEstatico.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", CalculatorEstatico.PI);

		sc.close();

	}

}
