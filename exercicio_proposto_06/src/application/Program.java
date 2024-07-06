package application;

// VER PROJETO MATRIZES

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Recebe quantidade de linhas e colunas para formar a matriz
		System.out.println("Digite dois numeros inteiros: ");
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		// Recebe os numeros que serao armazenados na matriz
		System.out
				.println("Digite '" + m + "' sequencia(s) de numeros, cada uma contendo '" + n + "' numeros inteiros:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// Testa um numero na matriz
		System.out.println("Digite um numero inteiro:");
		int num = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Position " + i + "," + j);
					// Retorna um numero paralelo ao escolhido com base na condicional
					if (j - 1 >= 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j + 1 < matriz[i].length) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i + 1 < matriz.length) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}

				}
			}
		}

		System.out.println();

		sc.close();
	}

}
