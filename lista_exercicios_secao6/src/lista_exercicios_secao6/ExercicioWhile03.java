package lista_exercicios_secao6;

import java.util.Scanner;

public class ExercicioWhile03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o combustivel que sera abastecido?");
		System.out.printf("(1) Alcool%n(2) Gasolina%n(3) Diesel%n(4) Fim%n");
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			if (combustivel == 1) {
				alcool += combustivel;
			}
			else if (combustivel == 2) {
				gasolina += combustivel;
			}
			else if (combustivel == 3) {
				diesel += combustivel;
			}
			else if (combustivel > 4 || combustivel < 1) {
				System.out.println("Opcao Invalida. Tente novamente!");
			}
			
			System.out.println("Qual o combustivel que sera abastecido?");
			System.out.printf("(1) Alcool%n(2) Gasolina%n(3) Diesel%n(4) Fim%n");
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");				
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();
	}

}
