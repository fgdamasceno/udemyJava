import java.util.Scanner;
import java.util.Locale;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Informe o tipo de combustivel que deseja abastecer:");
		System.out.println("(1) Alcool\n(2) Gasolina\n(3) Diesel\n(4) Fim ");
		int combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			if (combustivel > 4) {
				System.out.println("Digite um código de abastecimento correto.");
				System.out.println("(1) Alcool\n(2) Gasolina\n(3) Diesel\n(4) Fim ");
				combustivel = sc.nextInt();
			}
			else if (combustivel == 1) {
				alcool++;
				System.out.println("Alcool: " + alcool);
				combustivel = sc.nextInt();
			}
			else if (combustivel == 2) {
				gasolina++;
				System.out.println("Gasolina: " + gasolina);
				combustivel = sc.nextInt();
			}
			else {
				diesel++;
				System.out.println("Diesel: " + diesel);
				combustivel = sc.nextInt();
			}
		}
		
		System.out.println("MUITO OBRIGADO");

		sc.close();

	}

}
