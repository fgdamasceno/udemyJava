import java.util.Scanner;

public class stringMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome e sobrenome: ");
		String fname = sc.next();
		String lname = sc.next();
		String fullName = fname + " " + lname;
		
		System.out.println(fullName); // nome inteiro
		System.out.println(fullName.toLowerCase()); // tudo em letra minuscula
		System.out.println(fullName.toUpperCase()); // tudo em letra maiuscula
		System.out.println(fullName.trim()); // remove espaços do final
		System.out.println(fullName.substring(9)); // retorna a partir do index passado
		System.out.println(fullName.substring(3, 8).toUpperCase()); // parte do nome em letra maiuscula
		System.out.println(fullName.replace('o', '0').replace('a', '4').replace('e', '3').replace('s', '5')); // substitui letras
		System.out.println(fullName.indexOf('o')); // retorna o primeiro index
		System.out.println(fullName.lastIndexOf('o')); // retorna o ultimo index
		
		String[] nomes = fullName.split(" "); // Nome Sobrenome
		System.out.println(nomes[0]); // Nome
		System.out.println(nomes[1]); // Sobrenome
		
		sc.close();
		
	}

}
