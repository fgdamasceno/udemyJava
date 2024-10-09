package lista_exercicios_secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero para a coordenada 'x':");
		double x = sc.nextDouble();
		System.out.println("Digite o numero para a coordenada 'y'");
		double y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else {
			System.out.println("Origem");
		}

		sc.close();
	}

}
