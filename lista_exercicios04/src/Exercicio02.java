import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // define a quantidade de entradas

		int dentro = 0; // quantidade de numeros dentro da faixa [10, 20]
		int fora = 0; // quantidade de numeros fora da faixa [10, 20]

		for (int i = 0; i < N; i++) {
			int nums = sc.nextInt();
			if (nums >= 10 && nums <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}

		System.out.println(dentro + " in");
		System.out.println(fora + " out");

		sc.close();

	}

}
