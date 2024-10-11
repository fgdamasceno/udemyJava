package lista_exercicios_secao6;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double media = 0;
		int p1 = 2, p2 = 3, p3 = 5;
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			media = (a * p1 + b * p2 + c * p3) / (p1 + p2 + p3);
			System.out.printf("%.1f%n", media);
		}		
		
		sc.close();
	}

}
