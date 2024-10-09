package lista_exercicios_secao5;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int A = sc.nextInt();

		System.out.println("Digite mais um numero:");
		int B = sc.nextInt();

		if (A > B && A % B == 0) {
			System.out.println("Sao Multiplos");
		}
		else if (B > A && B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}

}
