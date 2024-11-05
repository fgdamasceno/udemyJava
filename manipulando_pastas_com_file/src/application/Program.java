package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String folderPath = sc.nextLine();
		
		File foPath = new File(folderPath); // File: CAMINHO DE ARQUIVO OU PASTA
		
		File[] folders = foPath.listFiles(File::isDirectory); // CRIA UM VETOR DE ARQUIVOS CONTENDO O CAMINHO PARA CADA PASTA NO CAMINHO ESPECIFICADO
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = foPath.listFiles(File::isFile); // CRIA UM VETOR DE ARQUIVOS CONTENTO O CAMINHO PARA CADA ARQUIVO NO CAMINHO ESPECIFICADO
		System.out.println("FILES:");
		for (File file: files) {
			System.out.println(file);
		}
		
		// CRIANDO UMA PASTA EM UM DIRETÓRIO ESPECIFICO
		boolean success = new File(foPath + "\\folder4").mkdir();
		System.out.println("Directory created successfully! " + success);
		
		
		// INFORMAÇÕES DO CAMINHO DO ARQUIVOS
		System.out.println("Enter a file path:");
		String filePath = sc.nextLine();
		
		File fiPath = new File(filePath);
		
		// ACESSAR SOMENTE O NOME DO ARQUIVO, E NÃO SEU CAMINHO COMPLETO
		System.out.println("getName: " + fiPath.getName()); // get.Name() RETORNA SOMENTE O NOME DO ARQUIVO
		System.out.println("getName: " + fiPath.getPath()); // get.Path() RETORNA O CAMINHO COMPLETO PARA O ARQUIVO
		System.out.println("getName: " + fiPath.getParent()); // get.Path() RETORNA O CAMINHO COMPLETO PARA O ARQUIVO
		
		
		
		
		
		sc.close();
	}

}
