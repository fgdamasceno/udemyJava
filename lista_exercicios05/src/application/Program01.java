package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program01 { // EXERCICIO 03

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		String nome = sc.nextLine();
		
		Aluno notas = new Aluno();
		notas.a = sc.nextDouble();
		notas.b = sc.nextDouble();
		notas.c = sc.nextDouble();
		
		double notaFinal = notas.grade();
		
		System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
		
		if (notaFinal > 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println(notas.approval());
		}

		
		sc.close();
	}

}
