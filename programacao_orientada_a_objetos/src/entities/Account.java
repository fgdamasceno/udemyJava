package entities;

public class Account {
	
	// Attributes
	private Integer number;
	private String holder;
	private Double balance = 0.0d;
	
	// Constructors
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// Getters and Setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

//	public void setBalance(Double balance) {
//		this.balance = balance;
//	};	
	
	// Methods
	public void deposit(double amount) {
		this.balance += amount;		
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.00;
	}

	@Override
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", number, holder, balance);
	}	
	
	

}
