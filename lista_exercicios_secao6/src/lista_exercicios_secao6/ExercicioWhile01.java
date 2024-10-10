package lista_exercicios_secao6;

import java.util.Scanner;

public class ExercicioWhile01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha de acesso de 4 (quatro) digitos:");
		int acesso = sc.nextInt();
		
		while (acesso != 2002) {
			System.out.println("Senha Invalida");
			acesso = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");

		sc.close();
	}

}
