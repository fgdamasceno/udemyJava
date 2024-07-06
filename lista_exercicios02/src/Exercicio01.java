import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro:");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		else { 
			System.out.println("NEGATIVO");
		}
		
		sc.close();

	}

}
