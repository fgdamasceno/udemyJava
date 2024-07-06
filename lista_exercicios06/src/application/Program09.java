package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * OBJETIVO: "mais_velho"
 * Ler uma quantidade x de nomes e idades,
 * Armazena-las em seus respectivos vetores,
 * Imprimir o nome da pessoa mais velha*/

public class Program09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Dados da pesso " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			names[i] = sc.next();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}
		
		String olderName = "";
		int olderAge = 0;
		for (int i = 0; i < names.length; i++) {
			if (ages[i] > olderAge) {
				olderAge = ages[i];
				olderName = names[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + olderName);

		
		sc.close();
	}

}
