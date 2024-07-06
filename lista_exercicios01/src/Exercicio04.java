import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.printf("NUMBER = %d%n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		sc.close();

	}

}
