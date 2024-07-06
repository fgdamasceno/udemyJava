package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		holder = sc.nextLine();

		Account accountData = new Account(accNumber, holder);
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		
		double transaction; // receives deposits and withdraws

		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			transaction = sc.nextDouble();
			accountData.deposit(transaction);
			System.out.println(accountData);
		} else {
			System.out.println(accountData);
		}

		// Deposits
		System.out.println();
		System.out.print("Enter a deposit value: ");
		transaction = sc.nextDouble();
		accountData.deposit(transaction);
		System.out.println(accountData);

		// Withdraws
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		transaction = sc.nextDouble();
		accountData.withdraw(transaction);
		System.out.println(accountData);

		sc.close();
	}

}
