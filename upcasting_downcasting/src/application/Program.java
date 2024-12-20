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
		
		
		// @Override CLASS
		Account acc6 = new Account(1005, "Linus", 1000.00);
		acc6.withdraw(200.00);
		System.out.println("Withdraw acc6 = $" + acc6.getBalance()); // 1000.00 - (200.00 + 5.00) = 795.00
		
		Account acc7 = new SavingsAccount(1006, "Jonas", 1000.00, 0.01);
		acc7.withdraw(200.00);
		System.out.println("Withdraw acc7 = $" + acc7.getBalance()); // 1000.00 - (200.00) = 800.00
		
		Account acc8 = new BusinessAccount(1007, "Bob", 1000.00, 500.00);
		acc8.withdraw(200);
		System.out.println("Withdraw acc8 = $" + acc8.getBalance()); // 1000.00 - (200.00 + 5.00) - 2.00 = 793.00

	}

}
