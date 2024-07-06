import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e final:");
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		if (horaInicial > horaFinal) {
			int totalHoras = 24 - horaInicial + horaFinal;
			System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
		}
		else if (horaInicial == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else {
			int totalHoras = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
		}
		
		sc.close();

	}

}
