import java.util.Scanner;

//RECEBE DOIS NUMEROS, EFETUA A SOMA DESTES E EXIBE O RESULTADO
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		
		System.out.println("SOMA = " +  soma);
		
		sc.close();

	}

}
