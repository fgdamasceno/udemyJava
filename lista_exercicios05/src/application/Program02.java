package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program02 {

	public static void main(String[] args) { // EXERCICIO 01
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Retangulo x = new Retangulo();
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.println(x.toString());

	}

}
