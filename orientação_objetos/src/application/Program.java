package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

/*
 * PROGRAMA SEM ORIENTACAO A OBJETOS
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		double xA, xB, xC, yA, yB, yC; // SEM ORIENTACAO A OBJETOS
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
//		xA = sc.nextDouble();  // SEM ORIENTACAO A OBJETOS 
//		xB = sc.nextDouble();  // SEM ORIENTACAO A OBJETOS
//		xC = sc.nextDouble();  // SEM ORIENTACAO A OBJETOS
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
//		yA = sc.nextDouble();  // SEM ORIENTACAO A OBJETOS
//		yB = sc.nextDouble();  // SEM ORIENTACAO A OBJETOS
//		yC = sc.nextDouble();  // SEM ORIENTACAO A OBJETOS
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
//		double p = (xA + xB + xC) / 2.0; // SEM ORIENTACAO A OBJETOS
//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC)); // SEM ORIENTACAO A OBJETOS
//		double p = (x.a + x.b + x.c) / 2.0; // SEM ORIENTACAO A OBJETOS
//		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c)); // SEM ORIENTACAO A OBJETOS
		double areaX = x.area();		
		
//		p = (yA + yB + yC) / 2.0; // SEM ORIENTACAO A OBJETOS
//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC)); // SEM ORIENTACAO A OBJETOS
//		p = (y.a + y.b + y.c) / 2.0; // SEM ORIENTACAO A OBJETOS
//		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c)); // SEM ORIENTACAO A OBJETOS
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
