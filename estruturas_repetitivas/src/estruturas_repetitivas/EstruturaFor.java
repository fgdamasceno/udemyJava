package estruturas_repetitivas;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // numero de repeticoes
		int soma = 0; // soma iniciada com valor 0
		
		for (int i = 0; i < n; i++) {
			int y = sc.nextInt(); // numeros que serao somados
			soma += y;
		}
		
		System.out.println(soma); // resultado da soma
		
		sc.close();
	}

}
