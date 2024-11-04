package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * IMPLEMENTAÇÃO BÁSICA PADRÃO
		 * COMO É FEITO MANUALMENTE
		 * INTENÇÃO: 
		 * MOSTRAR COMO SÃO ABERTAS E FECHADAS AS 'STREAMS'
		 */
		
		String path = "C:\\temp\\input.txt"; // CAMINHO PARA O ARQUIVO UTILIZADO
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			// br = new BufferedReader(new FileReader(path)); // VERSÃO SIMPLIFICADA DO CÓDIGO ACIMA
			
			String line = br.readLine(); // QUANDO CHEGA AO FINAL DA LINHA RETURNA null
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try { // NECESSARIO CASO ALGUMA EXCESSAO APAREÇA DURANTE O FECHAMENTO DOS STREAMS
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}			
		}

	}

}
