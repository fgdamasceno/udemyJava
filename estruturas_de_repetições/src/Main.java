import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// while loop: enquanto uma condicao for verdadeira
		// usa-se quando nao se sabe previamente a quantidade de repeticoes que sera
		// realizada

//		int x = sc.nextInt();
//		
//		int soma = 0;
//		
//		while (x != 0) {
//			soma += x;
//			x = sc.nextInt();
//		}
//		
//		System.out.println(soma);

		// for loop: repete para um certo intervalo de valores
		// usa-se quando se sabe previamente a quantidade de repeticoes que sera
		// realizada

//		int N = sc.nextInt();
//
//		int soma = 0;
//
//		for (int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			soma += x;
//		}
//
//		System.out.println(soma);
		
		// do-while loop: menos utilizada
		// o bloco de comandos executa pelo menos 1 vez, pois a condicao e verificada no final
		
		char continua;
		
		do {
			System.out.printf("Digite a temperatura em Celsius: ");
			int celsius = sc.nextInt();
			int fahrenheit = ((celsius * 9) / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %d%n", fahrenheit);
			System.out.printf("Deseja repetir (s/n)? ");
			continua = sc.next().charAt(0);
		}
		while (continua == 's');

		sc.close();

	}

}
