package lista_exercicios_secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario:");
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario > 2000.00 && salario <= 3000.00) {
			System.out.printf("R$ %.2f", ((salario - 2000) * 0.08));
		}
		else if (salario > 3000 && salario <= 4500) {
			System.out.printf("R$ %.2f", (((3000 - 2000) * 0.08) + ((salario - 3000) * 0.18)));
		}
		else {
			System.out.printf("R$ %.2f", (((3000 - 2000) * 0.08) + ((4500 - 3000) * 0.18) + ((salario - 4500) * 0.28)));
		}
		

		sc.close();
	}

}
