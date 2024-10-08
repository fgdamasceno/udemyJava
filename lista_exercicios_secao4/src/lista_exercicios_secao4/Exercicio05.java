package lista_exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int quantidadePeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int quantidadePeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double valorFinal = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);

		sc.close();
	}

}
