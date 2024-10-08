package expressões_aritméticas;

public class OperacoesAritmeticas {

	public static void main(String[] args) {
		
		// OPERACOES BASICAS
		System.out.println("Adicao: " + (2 + 8)); // 10
		System.out.println("Subtracao: " + (12 - 6)); // 6
		System.out.println("Multiplicacao: " + (10 * 5)); // 50
		System.out.println("Divisao: " + (12 / 6)); // 2
		System.out.println("Resto da divisao (modulo): " + (15 % 3)); // 0
		System.out.println("Resto da divisao (modulo): " + (15 % 4)); // 3 => 4 x 3 = 12 PARA 15 SÃO 3
		
		/*
		PRECEDENCIA DAS OPERACOES	
		MULTIPLICACAO E DIVISAO TEM MESMA PRECEDENCIA. ORDEM: ESQUERDA PARA DIREITA
		PARENTESES QUEBRA A ORDEM DE PRECEDENCIA: O QUE ESTA DENTRO E EXECUTADO PRIMEIRO
		 */
		System.out.println(2 * 6 / 3); // 2 * 6 = 12, 12 / 3 = 4 (ESQUERDA PARA DIREITA)
		System.out.println(6 / 3 * 2); // 6 / 3 = 2, 2 * 2 = 4
		
		System.out.println(3 + 2 * 4); // 11 
		System.out.println((3 + 2) * 4); // 20
		System.out.println(60 / (3 + 2) * 4); // 48 
		System.out.println(60 / ((3+ 3) * 4)); // 3 

	}

}
