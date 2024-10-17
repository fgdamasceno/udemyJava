package application;

import java.util.Scanner;

import entities.Quartos;

public class Pensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Quartos[] rooms = new Quartos[10];
		
		// nao solicitado no exercicio
		System.out.println("Free rooms:");
		System.out.print("Rooms: ");
		for (int i = 0; i < rooms.length; i++) {
			System.out.print(i + "# ");
		}
		
		System.out.printf("%n");
		System.out.print("\nHow many rooms will be rented? ");
		int n = sc.nextInt();		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent " + (i + 1) + "#:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Quartos(name, email, room); 
		}
		
		System.out.println();
		System.out.println("Busy rooms:");		
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].getRoom()
						+ ": " + rooms[i].getName()
						+ ", " + rooms[i].getEmail());
			}
		}
		
		// nao solicitado no exercicio
		System.out.println("\nFree rooms:");
		System.out.print("Rooms: ");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null)
			System.out.print(i + "# ");
		}
		
		sc.close();
	}

}
