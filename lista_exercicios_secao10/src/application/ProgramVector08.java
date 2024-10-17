package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] mediaPares = new int[n];
		
		for (int i = 0; i < mediaPares.length; i++) {
			mediaPares[i] = sc.nextInt();
		}
		
		int sum = 0;
		int contaPares = 0;
		for (int mp : mediaPares) {
			if (mp % 2 == 0) {
				sum += mp;
				contaPares++;
			}
		}
		
		double avg = (double) sum / contaPares;
		
		if (sum != 0) {
			System.out.print("MEDIA DOS PARES = " + avg);			
		} 
		else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
