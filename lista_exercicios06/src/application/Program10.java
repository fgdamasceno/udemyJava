package application;

import java.util.Locale;
import java.util.Scanner;

/*
 * OBJETIVO: "aprovados"
 * Ler uma quantidade x de alunos e notas de 2 semestres para cada,
 * Armazenar os dados em vetores,
 * Imprimir o nome dos aprovados com base na media de aprovacao 6.0 */

public class Program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		double[] firstSemester = new double[n];
		double[] secondSemester = new double[n];
		double[] finalScore = new double[n];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "º aluno");
			sc.nextLine();
			names[i] = sc.nextLine();
			firstSemester[i] = sc.nextDouble();
			secondSemester[i] = sc.nextDouble();
		}
		
		// soma das notas dos vetores
		for (int i = 0; i < names.length; i++) {
			finalScore[i] = (firstSemester[i] + secondSemester[i]) / 2;
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < names.length; i++) {
			if (finalScore[i] >= 6.0) {
				System.out.println(names[i] + " " + finalScore[i]);
			}
		}

		
		sc.close();
	}

}
