package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * OBJETIVO: "media_pares"
 * Ler uma quantidade x de numeros inteiros,
 * Imprimir a media aritmetica dos numeros pares com uma casa decimal,
 * Exibir mensagem caso nao exita numeros pares no vetor*/

public class Program08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		double evenAvg = 0;
		int evenNum = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				evenAvg += vect[i];
				evenNum += 1;
			}
		}
		evenAvg = (double) evenAvg / evenNum;
		if (evenNum != 0) {
			System.out.printf("MEDIA DOS PARES: %.1f", evenAvg);			
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
