import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b != 0) {
				double div = (double) a / b;
				System.out.println(div);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();

	}

}
