package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account = new Account();
		
		System.out.print("Enter account number: ");
		account.setNumber(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		account.setHolder(sc.nextLine());
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			account.deposit(sc.nextDouble());
		}		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);		
		
		sc.close();
	}

}
