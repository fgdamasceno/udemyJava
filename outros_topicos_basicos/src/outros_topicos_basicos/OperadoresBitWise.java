package outros_topicos_basicos;

import java.util.Scanner;

public class OperadoresBitWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mask = 32; // 32 ou 0b00100000
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bis is false!");
		}
		
		sc.close();
	}

}
