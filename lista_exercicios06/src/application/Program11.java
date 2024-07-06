package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * OBJETIVO: "dados_pessoas"
 * Ler uma quantidade x de alturas e sexos,
 * armazenar os dados em vetores,
 * Imprimir a maior e a menor altura,
 * Imprimir a media de altura feminina,
 * Imprimir a quantidade de individuos dos exo masculino*/

public class Program11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] height = new double[n];
		char[] genre = new char[n];

		for (int i = 0; i < height.length; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			height[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			genre[i] = sc.next().charAt(0);
		}

		// menor altura
		double lowest = height[0];
		for (int i = 0; i < height.length; i++) {
			if (height[i] < lowest) {
				lowest = height[i];
			}
		}
		System.out.printf("Menor altura: %.2f%n", lowest);

		// maior altura
		double highest = height[0];
		for (int i = 0; i < height.length; i++) {
			if (height[i] > highest) {
				highest = height[i];
			}
		}
		System.out.printf("Maior altura: %.2f%n", highest);

		// media altura mulheres
		double totalHeight = 0;
		int women = 0;
		for (int i = 0; i < height.length; i++) {
			if (genre[i] == 'F') {
				totalHeight += height[i];
				women++;
			}
		}
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", (totalHeight / women));

		// quantidade de homens
		int men = 0;
		for (int i = 0; i < height.length; i++) {
			if (genre[i] == 'M') {
				men++;
			}
		}
		System.out.printf("Numero de homens = %d%n", men);

		sc.close();
	}

}
