import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		String[] rooms = new String[10];
		String[] names = new String[10];
		String[] emails = new String[10];

		int room = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			names[i] = sc.nextLine();
			System.out.print("Email: ");
			emails[i] = sc.next();
			System.out.print("Room: ");
			room = sc.nextInt();
			rooms[room] = names[i] + ", " + emails[i];
		}

		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println((i) + ": " + rooms[i]);
			}
		}

		sc.close();
	}

}
