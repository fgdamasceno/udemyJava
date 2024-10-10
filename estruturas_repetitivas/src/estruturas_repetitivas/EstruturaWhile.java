package estruturas_repetitivas;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int x =  sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			System.out.println("Digite outro número:");
			soma += x;
			x = sc.nextInt();
		}		
		
		System.out.println("A soma dos números digitados é = " + soma);
		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
