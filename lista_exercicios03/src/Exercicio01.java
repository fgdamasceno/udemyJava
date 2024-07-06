import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
				
		while (senha != 2002) {
			
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");

		sc.close();

	}

}
