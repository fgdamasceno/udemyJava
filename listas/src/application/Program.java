package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// adicionando itens à lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// verificar o tamanho da lista
		System.out.println(list.size());
		
		System.out.println(list);
		
		// inserir elemento na posição especificada
		list.add(2, "Marco"); // adiciona em posição especifica e empurra os demais para frente na lista
		
		System.out.println(list);
		
		// removendo elemento da lista
		list.remove("Anna"); // compara se o elemento existe na lista e se o encontra nela, o remove
		// list.remove(1) // tambem remove por index
		// list.removeIf(x -> x.charAt(0) == 'M'); // remove por predicado (lambda)
		
		// encontrando a posição de um elemento
		System.out.println(list.indexOf("Bob")); // retorna o index do elemento. Se o elemento não existe, retorna -1
		System.out.println(list.indexOf("Fernando")); // retorna -1 porque o elemento não exite na lista
		
		// filtrar para que fique na lista apenas os elementos que atendam a um filtro
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		System.out.println(result);
		
		// encontrar o primeiro elemento em uma Lista que atenda a um certo predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null); 
		// retorna nulo se o elemento buscado não existir na lista
		System.out.println(name); // no exemplo, retorna Maria
		
		
		// percorrendo os itens da lista
		for (String l : list) {
			System.out.println(l);
		}

	}

}
