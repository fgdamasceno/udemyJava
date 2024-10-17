package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] underAvg = new double[n];
		
		for (int i = 0; i < underAvg.length; i++) {
			System.out.print("Digite um numero: ");
			underAvg[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i = 0; i < underAvg.length; i++) {
			sum += underAvg[i];
		}
		
		double avg = sum / underAvg.length;
		System.out.printf("%nMEDIA DO VETOR = %.3f%n", avg);
		
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < underAvg.length; i++) {
			if (underAvg[i] < avg) {
				System.out.println(underAvg[i]);
			}
		}
		
		sc.close();
	}

}
