package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// CODIGO INICIAL -> SERA FUTURAMENTE MELHORADO EM OUTRO PROJETOS

		File file = new File("C:\\temp\\input.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		/*
		 * sc.close() DENTRO DE FINALLY POIS CASA UMA EXCEÇÃO SEJA LANÇADA DURANTE A
		 * ABERTURA/LEITURA DO ARQUIVO O BLOCO try NAO SERA EXECUTADO E O CODIGO CAIRA
		 * EM catch DEIXANDO ASSIM O Scanner ABERTO FINALLY SERVE PARA QUE ISSO SEJA
		 * TRATADO DE FORMA CORRETA E PARA QUE O Scanner SEJA DEVIDAMENTE FECHADO if ()
		 * PARA VERIFICAR SE O Scanner FOI DEVIDAMENTE INSTANCIADO CASO NÃO TENHA SIDO,
		 * NAO PODEMOS SIMPLESMENTE EXECUTAR sc.close() POIS TERIAMOS UMA EXCEÇÃO
		 * NullPointerException POR CONTA DISTO, FAZ-SE NECESSÁRIO VERIFICAR
		 * PRIMEIRAMENTE SE O Scanner FOI DEVIDAMENTE INSTANCIADO
		 */

	}

}
