package lista_exercicios_secao6;

import java.util.Scanner;

public class ExercicioFor07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
		}
		
		sc.close();
	}

}
