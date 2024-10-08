package lista_exercicios_secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble(); // DEVERIA RECEBER O MAIOR VALOR DEVIDO À AREA DO TRIANGULO RETANGULO
		C = sc.nextDouble();
		
		double areaTrianguloRetangulo = A * C / 2;
		double areaCirculo = PI * Math.pow(C, 2);
		double areaTrapezio = (A + B) * C / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
