import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura de Repeticao
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas são?");
		int horas = sc.nextInt();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else if (horas < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		sc.close();

	}

}
