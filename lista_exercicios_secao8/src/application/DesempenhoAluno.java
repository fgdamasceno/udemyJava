package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class DesempenhoAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.name = sc.nextLine();
		System.out.print("No 1º trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("No 2º trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("No 3º trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno.approval());
		
		sc.close();
	}

}
