import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int qtdePeca1 = sc.nextInt();
		double valorUnit1 = sc.nextDouble();
		sc.nextLine();
		int codigo2 = sc.nextInt();
		int qtdePeca2 = sc.nextInt();
		double valorUnit2 = sc.nextDouble();
		
		double precoPeca1 = qtdePeca1 * valorUnit1;
		double precoPeca2 = qtdePeca2 * valorUnit2;
		
		double valorTotal = precoPeca1 + precoPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		
		sc.close();

	}

}
