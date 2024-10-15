package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Negatives;

public class ProgramVector01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();


		if (n < 0 || n > 10) {
			System.out.println("QUANTIDADE INVALIDA!");
		} else {
			Negatives[] vect = new Negatives[n];
			for (int i = 0; i < vect.length; i++) {
				sc.nextLine();
				System.out.print("Digite um numero: ");
				int num = sc.nextInt();
				vect[i] = new Negatives(num);
			}
			System.out.println("NUMEROS NEGATIVOS:");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i].getNumber() < 0) {
					System.out.println(vect[i].getNumber());
				}
			}
		}


		sc.close();
	}

}
