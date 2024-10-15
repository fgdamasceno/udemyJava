package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetor02;

public class ProgramaVetor02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetor02[] vect = new ProductVetor02[n]; // cria vetor com n posições
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor02(name, price); // para cada n posiçao do vect, armazena os valores de nome e preço
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f", avg);
			
			
		sc.close();
	}

}
