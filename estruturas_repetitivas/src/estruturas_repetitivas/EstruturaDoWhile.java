package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		char repetir;
				
		do {
			System.out.println("Digite a temperatura em Celcius:");
			double celcius = sc.nextDouble();
			double fahrenheit = (9 * celcius / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.println("Deseja repetir (s/n)?");
			repetir = sc.next().charAt(0);
		} while (repetir != 'n');
		
		sc.close();
	}

}
