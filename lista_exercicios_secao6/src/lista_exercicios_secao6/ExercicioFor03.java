package lista_exercicios_secao6;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double m1 = 0, m2 = 0, m3 = 0;
		int p1 = 2, p2 = 3, p3 = 5;
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			if (i + 1 == 1) {
				m1 = ((a * p1) + (a * p2) + (c + p3) / p1 + p2 + p3);
			}
			else if (i + 1 == 2) {
				m2 = ((a * p1) + (a * p2) + (c + p3) / p1 + p2 + p3);
			}
			else {
				m3 = ((a * p1) + (a * p2) + (c + p3) / p1 + p2 + p3);
			}
		}
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		sc.close();
	}

}
