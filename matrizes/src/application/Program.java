package application;

import java.util.*;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		System.out.println("Digite '" + m + "' sequencia(s) de numeros, cada uma contendo '" + n + "' numeros inteiros:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um numero inteiro:");
		int c = sc.nextInt();
		
		System.out.println();
		
		
		

		
		sc.close();
	}

}
