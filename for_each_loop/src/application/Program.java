package application;

public class Program {

	public static void main(String[] args) {
		
		String[] names = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("----------");
		
		for (String name : names) {
			System.out.println(name);
		}
 
	}

}
