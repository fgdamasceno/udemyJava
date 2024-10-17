package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Approved;

public class ProgramVector10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Approved[] aprovados = new Approved[n];
		
		for (int i = 0; i < aprovados.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do "
					+ (i + 1 )+ "o aluno:");
			String name = sc.nextLine();
			double firstNote = sc.nextDouble();
			double secondNote = sc.nextDouble();
			aprovados[i] = new Approved(name, firstNote, secondNote);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < aprovados.length; i++) {
			double avg = 0.0;
			double somaNotas = aprovados[i].getFirstNote() 
					+ aprovados[i].getSecondNote();
			avg = somaNotas / 2;
			if (avg >= 6.0) {
				System.out.println(aprovados[i].getName());
			}
		}		
		
		sc.close();
	}

}
