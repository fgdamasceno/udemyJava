package lista_exercicios_secao6;

import java.util.Scanner;

public class ExercicioFor05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long fatorial = 1; // pode calcular ate fatorial 25
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}
