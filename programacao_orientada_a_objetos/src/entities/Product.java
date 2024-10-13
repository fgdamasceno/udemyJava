package entities;

public class Product {

	// Attributes
	public String name;
	public double price;
	public int quantity;

	// Methods
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	@Override
	public String toString() {
		return String.format("%nUpdated data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price, quantity,
				totalValueInStock());
	}

}
