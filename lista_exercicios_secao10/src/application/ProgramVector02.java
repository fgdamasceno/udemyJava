package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros vc vai digitar? ");
		int n = sc.nextInt();

		Double[] vect = new Double[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			vect[i] = sc.nextDouble();
		}

		System.out.println();
		System.out.print("VALORES = ");
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
			sum += vect[i];
		}
		double avg = sum / vect.length;

		System.out.println();
		System.out.printf("SOMA = %.2f", sum);
		System.out.println();
		System.out.printf("MEDIA = %.2f", avg);

		sc.close();
	}

}
