package estrutura_condicional;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		// E lógico
		boolean c = a > b && b < a; // false
		boolean d = a < b && b > a; // true
		boolean e = a < b && b < a; // false
		// OU lógico
		boolean f = a < b || b > a; // true
		boolean g = a > b || b > a; // true
		boolean h = a > b || b < a; // false...
		// NÃO lógico
		boolean i = !(a > b); // true
		boolean j = !(b < a); // true
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		
	}
}
