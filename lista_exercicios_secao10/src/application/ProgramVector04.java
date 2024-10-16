package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Position;

public class ProgramVector04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Position[] positions = new Position[n];
		
		for (int i = 0; i < positions.length; i++) {
			System.out.print("Digite um numero: ");
			double p = sc.nextDouble();
			positions[i] = new Position(p);
		}
		
		double maiorNum = 0.0;
		int maiorPosition = 0;
		for (int i = 0; i < positions.length; i++) {
			if (positions[i].getNum() > maiorNum) {
				maiorNum = positions[i].getNum();
				maiorPosition = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maiorNum);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", maiorPosition);
		
		sc.close();
	}

}
