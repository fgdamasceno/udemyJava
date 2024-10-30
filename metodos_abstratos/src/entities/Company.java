package entities;

public class Company extends TaxPayer {
	
	private int employeeQuantity;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int employeeQuantity) {
		super(name, anualIncome);
		this.employeeQuantity = employeeQuantity;
	}
	
	public int getEmployeeQuantity() {
		return employeeQuantity;
	}

	public void setEmployeeQuantity(int employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}

	@Override
	public double taxCalculator() {
		double tax = 0.0;
		
		if (employeeQuantity < 10) {
			tax = super.getAnualIncome() * 0.16;
		}
		else {
			tax = super.getAnualIncome() * 0.14;
		}
		
		return tax;
	}

}
