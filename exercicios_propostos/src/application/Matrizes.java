package application;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt(); // PARA COLETAR O NUMERO DE LINHAS DA MATRIZ
		int n = sc.nextInt(); // PARA COLETAR O NUMERO DE COLUNAS DA MATRIZ

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// OPICIONAL NAO SOLICITADO: EXIBE A MATRIZ
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		
		// RECEBE UM NUMERO DA MATRIZ E VERIFICA QUAIS ESTAO À SUA VOLTA
		int x = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Position: " + i + ", " + j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]); // ESQUERDA						
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]); // ACIMA						
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j+1]); // DIREITA						
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i+1][j]); // ABAIXO						
					}
				}
			}
		}

		sc.close();
	}

}
