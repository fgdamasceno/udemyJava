package lista_exercicios_secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		double numero = sc.nextDouble();

		if (numero > 0 && numero <= 25.0) {
			System.out.println("Intervalo (0, 25)");
		}
		else if (numero > 25.0 && numero <= 50.0) {
			System.out.println("Intervalo (25, 50)");
		}
		else if (numero > 50.0 && numero <= 75.0) {
			System.out.println("Intervalo (50, 75)");
		}
		else if (numero > 75.0 && numero <= 100) {
			System.out.println("Intervalo (75, 100)");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}

}
