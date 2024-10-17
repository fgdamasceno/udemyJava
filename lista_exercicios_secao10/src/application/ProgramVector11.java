package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < altura.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}

		double menorAltura = 5.0;
		double maiorAltura = 0;
		double somaAlturaMulheres = 0.0;
		int contagemMulheres = 0;
		double mulheresAvg = 0.0;
		int homens = 0;

		for (int i = 0; i < altura.length; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (genero[i] == 'F') {
				somaAlturaMulheres += altura[i];
				contagemMulheres++;
				mulheresAvg = somaAlturaMulheres / contagemMulheres;
			} else {
				homens++;
			}
		}

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mulheresAvg);
		System.out.printf("Numero de homens: %d", homens);

		sc.close();
	}

}
