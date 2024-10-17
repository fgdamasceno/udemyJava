package application;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		System.out.println("X..... = " + x + " > tipo valor");
		
		Object obj = x;
		System.out.println("Obj... = " + obj + " > tipo referencia; boxing");
		
		int y = (int) x; // necessita casting
		System.out.println("Y..... = " + y + " > tipo valor; unboxing");
		
		
		System.out.println("|==============================|");
		
		// COM O USO DE WRAPPER CLASSES (NOTE A DIFERENCA NO UNBOXING)
		
		int a = 50;
		Integer i = a; // boxing
		int b = i; // unboxing - nao necessita casting
		
		System.out.println("A..... = " + a + " > tipo valor");
		System.out.println("I..... = " + i + " > tipo referencia; boxing");
		System.out.println("B..... = " + b + " > tipo valor; unboxing");

	}

}
