package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramMelhorado {

	public static void main(String[] args) {
		
		/*
		 * IMPLEMENTAÇÃO MELHORADA
		 * >>> VER Program NESTE MESMO PACOTE PARA COMPARAR COM VERSÃO ANTERIOR
		 */
		
		String path = "C:\\temp\\input.txt"; // CAMINHO PARA O ARQUIVO UTILIZADO
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {						
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
