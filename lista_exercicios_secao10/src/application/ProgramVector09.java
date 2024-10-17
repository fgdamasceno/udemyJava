package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class ProgramVector09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		People[] names = new People[n];
		People[] ages = new People[n];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.next();
			names[i] = new People(name);
			System.out.print("Idade: ");
			int age = sc.nextInt();
			ages[i] = new People(age);
		}
		
		int older = 0;
		String olderName = "";
		for (int i = 0; i < ages.length; i++) {
			if (ages[i].getAge() > older) {
				older = ages[i].getAge();
				olderName = names[i].getName();
			}
		}		
		
		System.out.print("PESSOA MAIS VELHA: " + olderName);		

		sc.close();
	}

}
