import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raioCirculo = sc.nextDouble();
		
		double pi = 3.14159;
		double area = pi * Math.pow(raioCirculo, 2.0);
		
		System.out.printf("A=%.4f", area);
		
		sc.close();

	}

}
