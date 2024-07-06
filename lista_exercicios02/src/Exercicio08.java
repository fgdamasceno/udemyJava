import java.util.Scanner;
import java.util.Locale;


public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario:");
		double salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario <= 3000) {
			double impostoDevido = ((salario - 2000) * 0.08);
			System.out.printf("R$ %.2f", impostoDevido);
		}
		else if (salario <= 4500) {
			double impostoDevido = (1000 * 0.08) + ((salario - 3000) * 0.18);
			System.out.printf("R$ %.2f ", impostoDevido);
		}
		else {
			double impostoDevido = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
			System.out.printf("R$ %.2f ", impostoDevido);
		}
		
		sc.close();

	}

}
