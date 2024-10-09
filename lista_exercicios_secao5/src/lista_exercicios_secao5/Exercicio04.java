package lista_exercicios_secao5;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial:");
		int horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final:");
		int horaFinal = sc.nextInt();
		
		if (horaFinal < horaInicial) {
			System.out.println("O JOGO DUROU " + ((24 - horaInicial) + horaFinal) + " HORAS(S)");
		}
		else if (horaInicial == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORAS(S)");
		}
		else {
			System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORAS(S)");
		}
		
		sc.close();
	}

}
