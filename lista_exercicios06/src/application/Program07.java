package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * OBJETIVO: "abaixo_da_media"
 * Ler uma quantidade x de numeros reais,
 * Imprimir a media aritmetica de todos os elementos com 3 casas decimais,
 * Imprimir todos os elementos do vetor que estejam abaixo da media com uma casa decimal*/

public class Program07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		double avg = 0;
		for (int i = 0; i < vect.length; i++) {
			avg += vect[i];
		}
		avg = avg / n;
		System.out.printf("%nMEDIA DO VETOR: %.3f%n", avg);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}

}
