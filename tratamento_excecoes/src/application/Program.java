package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Numero invalido");
		}
		catch (InputMismatchException e) {
			System.out.println("Caractere inválido. Digite um numero.");
		}
		
		
		
				
		sc.close();
	}

}
