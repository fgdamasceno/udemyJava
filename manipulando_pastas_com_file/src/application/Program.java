package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); // File: CAMINHO DE ARQUIVO OU PASTA
		
		File[] folders = path.listFiles(File::isDirectory); // CRIA UM VETOR DE ARQUIVOS CONTENDO O CAMINHO PARA CADA PASTA NO CAMINHO ESPECIFICADO
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); // CRIA UM VETOR DE ARQUIVOS CONTENTO O CAMINHO PARA CADA ARQUIVO NO CAMINHO ESPECIFICADO
		System.out.println("FILES:");
		for (File file: files) {
			System.out.println(file);
		}
		
		// CRIANDO UMA PASTA EM UM DIRETÓRIO ESPECIFICO
		boolean success = new File(strPath + "\\folder4").mkdir();
		System.out.println("Directory created successfully! " + success);
		
		sc.close();
	}

}
