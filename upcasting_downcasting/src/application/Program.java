package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc;
		System.out.println("Balance acc1 = $" + acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // OBJETO DA SUBCLASS2 ATRIBUIDO À UMA VARIÁVEL DA SUPERCLASSE 
		System.out.println("Balance acc2 = $" + acc2.getBalance());
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // OBJETO DA SUBCLASS2 ATRIBUIDO À UMA VARIÁVEL DA SUPERCLASSE 
		System.out.println("Balance acc3 = $" + acc3.getBalance());
		
		
		// DOWNCASTING		
		BusinessAccount acc4 = (BusinessAccount) acc2; // NECESSITA DE CASTING MANUAL
		acc4.loan(100.00); // OPERAÇÃO .loan() INDISPONIVEL PARA acc2 DEVIDO AO TIPO DE CONTA, PORÉM POSSÍVEL AQUI DEVIDO AO DOWNCASTING
		System.out.println("Balance acc4 = $" + acc4.getBalance());
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; // NÃO POSSÍVEL DE SUBCLASSES PARA SUBCLASSE
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("EMPRÉSTIMO REALIZADO");
		}
		
		if (acc3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("UPDATE REALIZADO");
		}

	}

}
