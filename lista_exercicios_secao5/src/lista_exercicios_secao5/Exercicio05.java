package lista_exercicios_secao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========== CARDAPIO ===========");
		System.out.printf("(1) Cachorro Quente --- R$ 4.00%n"
				+ "(2) X-Salada ---------- R$ 4.50%n"
				+ "(3) X-Bacon ----------- R$ 5.00%n"
				+ "(4) Torrada simples --- R$ 2.00%n"
				+ "(5) Refrigerante ------ R$ 1.50%n");
		
		System.out.println("=== DIGITE O CODIGO (1 a 5): ===");
		int codigo = sc.nextInt();		
		System.out.println("=== DIGITE A QUANTIDADE DESEJADA: ===");
		int quantidade = sc.nextInt();
		
		if (codigo == 1) {
			System.out.printf(quantidade + " Cachorro(s) quente(s). Total =  R$ %.2f", (4.00 * quantidade));												
		}
		else if (codigo == 2) {
			System.out.printf(quantidade + " X-Saladas(s). Total =  R$ %.2f", (4.50 * quantidade));
		}
		else if (codigo == 3) {
			System.out.printf(quantidade + " X-Bacon(s). Total =  R$ %.2f", (5.00 * quantidade));			
		}
		else if (codigo == 4) {
			System.out.printf(quantidade + " Torrada(s) simples. Total =  R$ %.2f", (2.00 * quantidade));						
		}
		else if (codigo == 5) {
			System.out.printf(quantidade + " Refrigerante(s). Total =  R$ %.2f", (1.50 * quantidade));									
		}
		else {
			System.out.println("OPÇÃO INVALIDA!");
		}
		
		sc.close();
	}

}
