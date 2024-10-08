package lista_exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double raio = sc.nextDouble();
		double areaCirculo = PI * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", areaCirculo);
		
		sc.close();
	}

}
