package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] pares = new int[n];
		
		for (int i = 0; i < pares.length; i++) {
			System.out.print("Digite um numero: ");
			pares[i] = sc.nextInt();
		}
		
		int count = 0;
		System.out.println("\nNUMEROS PARES: ");
		for (int i = 0; i < pares.length; i++) {			
			if (pares[i] % 2 == 0) {
				System.out.print(pares[i] + " ");
				count++;
			}
		}	
		
		
		System.out.printf("%n%nQUANTIDADE DE PARES = " + count);
		
		sc.close();
	}

}
