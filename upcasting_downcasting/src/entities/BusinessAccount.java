package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // EXECUTA A LOGICA DO CONSTRUTOR DA CLASSE BASE (HERDADA [ super class])
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan (double amount) {
		if (amount <= loanLimit) {
			balance += amount - 20;
			deposit(amount);			
		}
	}

}
