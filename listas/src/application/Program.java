package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> names = new ArrayList<>(); // usar Wrapper Class: Integer NOT int
		
		// add
		names.add("Maria");
		names.add("Alex");
		names.add("Bob");
		names.add("Anna");		
		names.add(2, "Fernando");
		
		for (String name : names ) { // para cada nome na lista de nomes
			System.out.println(name);
		}
		
		//size
		System.out.println("A lista contem '" + names.size() + "' elementos");
		
		// remove
		names.remove("Maria");
		names.remove(1);
		names.removeIf(x -> x.charAt(0) == 'B');
		
		for (String name : names ) {
			System.out.println(name);
		}
		
		// find
		System.out.println("Index of Anna: " + names.indexOf("Anna"));
		System.out.println("Index of Paulo: " + names.indexOf("Paulo"));
		
		names.add("Marco");
		// filter
		List<String> result = names.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result ) {
			System.out.println(x);
		}
		
		// find first
		String name = names.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		name = names.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		sc.close();
	}

}
