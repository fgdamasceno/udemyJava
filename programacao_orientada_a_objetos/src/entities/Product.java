package entities;

public class Product {

	// Attributes
	public String name;
	public double price;
	public int quantity;
	
	
	// Contructors
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}	
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}	

	
	// Getters and Setters
	

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
		return String.format("%s, $ %.2f, %d units, Total: $ %.2f%n", name, price, quantity,
				totalValueInStock());
	}

}
