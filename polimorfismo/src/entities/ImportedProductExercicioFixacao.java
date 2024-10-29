package entities;

public class ImportedProductExercicioFixacao extends ProductExercicioFixacao {
	
	private Double customsFee;

	public ImportedProductExercicioFixacao() {
		super();
	}

	public ImportedProductExercicioFixacao(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + " " + totalPrice() + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
	}

	public double totalPrice() {
		return super.getPrice() + customsFee ;
	}

}
