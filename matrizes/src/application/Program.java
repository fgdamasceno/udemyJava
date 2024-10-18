package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// INSTANCIAÇÃO DE UMA MATRIZ BIDIMENSIONAL
		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) { // .length PARA PERCORRER AS LINHAS DA MATRIZ
			for (int j = 0; j < matriz[i].length; j++) { // [n].length PARA PERCORRER AS COLUNAS DA MATRIZ
				matriz[i][j] = sc.nextInt();
			}
		}

		// PERCORRE A DIAGONAL PRINCIPAL DE UMA MATRIZ
		System.out.println("Main diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		// CONTA A QUANTIDADE DE NUMEROS NEGATIVOS
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers:");

		sc.close();
	}

}
