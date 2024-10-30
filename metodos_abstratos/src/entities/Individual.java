package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpediture;

	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpediture) {
		super(name, anualIncome);
		this.healthExpediture = healthExpediture;
	}
	
	public Double getHealthExpediture() {
		return healthExpediture;
	}

	public void setHealthExpediture(Double healthExpediture) {
		this.healthExpediture = healthExpediture;
	}

	@Override
	public double taxCalculator() {
		double tax = 0.0;
		
		if (super.getAnualIncome() < 20000.0) {
			tax = super.getAnualIncome() * 0.15;
		}
		else {
			tax = super.getAnualIncome() * 0.25;
 		}
		
		if (healthExpediture > 0) {
			tax -= healthExpediture * 0.5;
		}
		
		return tax;
	}

}
