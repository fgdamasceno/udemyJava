package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Heights;

public class ProgramVector03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Heights[] heights = new Heights[n];

		for (int i = 0; i < heights.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: "); // verificar inserção de sc.nextLine();
			double height = sc.nextDouble();
			heights[i] = new Heights(name, age, height);
		}

		double sum = 0.0;
		for (int i = 0; i < heights.length; i++) {
			sum += heights[i].getHeight();
		}
		double avg = sum / heights.length;

		double under16 = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i].getAge() < 16) {
				under16++;
			}
		}

		System.out.printf("Altura media: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos %.1f%%%n", under16 / heights.length * 100);

		for (int i = 0; i < heights.length; i++) {
			if (heights[i].getAge() < 16) {
				System.out.println(heights[i].getName());
			}
		}

//		// TESTES
//		for (int i = 0; i < heights.length; i++) {
//			System.out.println(heights[i].getName());
//			System.out.println(heights[i].getAge());
//			System.out.println(heights[i].getHeight());
//		}

		sc.close();
	}

}
