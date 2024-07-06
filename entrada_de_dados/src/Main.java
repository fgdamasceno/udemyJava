import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int anoAtual = 2024;
		
		Scanner sc = new Scanner(System.in);
		
//		Digitar primeiro e ultimo nome
//		System.out.println("Digite o seu primeiro nome:");
//		String primeiroNome = sc.next();
//		System.out.println("Digite o seu ultimo nome:");
//		String ultimoNome = sc.next();
		
//		Digitar nome completo
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = sc.nextLine();
		System.out.println("Digite o seu ano de nascimento:");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		System.out.println("Qual o seu sexo (M) ou (F):");
		char sexo = sc.next().charAt(0);
		
		if(sexo == 'm') {
			System.out.println("Seu nome e " + nomeCompleto + ", voce tem " + idade + " anos e voce e do sexo masculino");			
		} else {
			System.out.println("Seu nome e " + nomeCompleto + ", voce tem " + idade + " anos e voce e do sexo feminino");
		}
		
		
		sc.close();

	}

}
