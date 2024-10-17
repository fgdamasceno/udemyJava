package estruturas_repetitivas;

public class EstruturaForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		// FOR LOOP 
		System.out.println("FOR LOOP");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		// FOR EACH LOOP
		System.out.println("FOR EACH LOOP");
		for (String v : vect) { // LEITURA: para cada 'v' no objeto 'vect', faça:
			System.out.println(v);
		}		

	}

}
