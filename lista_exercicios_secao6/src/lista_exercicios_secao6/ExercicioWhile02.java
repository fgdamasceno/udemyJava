package lista_exercicios_secao6;

import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira coordenada (X):");
		int x = sc.nextInt();
		System.out.println("Digite a segunda coordenada (Y)");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro plano");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo plano");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro plano");
			}
			else {
				System.out.println("Quarto plano");
			}
			System.out.println("Digite novamente a primeira coordenada (X):");
			x = sc.nextInt();
			System.out.println("Digite novamente a segunda coordenada (Y)");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
