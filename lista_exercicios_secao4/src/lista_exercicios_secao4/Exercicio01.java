package lista_exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
