import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.00;
		
		System.out.println("Digite o numero do pedido e a quantidade desejada:");
		int pedido = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if (pedido == 1) {
			System.out.printf("Total: R$ %.2f", quantidade * cachorroQuente);
		}
		else if (pedido == 2) {
			System.out.printf("Total: R$ %.2f", quantidade * xSalada);
		}
		else if (pedido == 3) {
			System.out.printf("Total: R$ %.2f", quantidade * xBacon);
		}
		else if (pedido == 4) {
			System.out.printf("Total: R$ %.2f", quantidade * torradaSimples);
		}
		else if (pedido == 5) {
			System.out.printf("Total: R$ %.2f", quantidade * refrigerante);
		}
		
		sc.close();

	}

}
