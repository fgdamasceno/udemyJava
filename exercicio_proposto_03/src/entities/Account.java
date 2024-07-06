package entities;

public class Account {
	
	private final int accNumber;
	private String holder;
	private double balance;
	private double tax;
	
	// Constructor
	
	public Account(int accNumber) {
		this.accNumber = accNumber;
	}	
	
	public Account(int accNumber, String holder) {
		this.accNumber = accNumber;
		this.holder = holder;
		this.tax = 5.00;
	}

	public Account(int accNumber, String holder, double balance) {
		this.accNumber = accNumber;
		this.holder = holder;
		this.balance = balance;
		this.tax = 5.00;
	}
	
	// Setters and Getters
	public int getAccNumber() {
		return accNumber;
	}
	
//	public void setAccNumber(int accNumber) {
//		this.accNumber = accNumber;
//	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return this.balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	// Methods
	public double deposit(double deposit) {
		return this.balance += deposit;
	}
	
	public double withdraw(double withdraw) {
		return this.balance -= withdraw + this.tax;
	}

	public String toString() {
		return String.format("%n")
				+ "Account data:"
				+ String.format("%n")
				+ "Account "
				+ String.format("%d", getAccNumber()) // ajustar variavel
				+ ", Holder: "
				+ String.format("%s", getHolder()) // ajustar variavel
				+ ", Balance: $ "
				+ String.format("%.2f", getBalance()); // ajustar variavel
	}
}
