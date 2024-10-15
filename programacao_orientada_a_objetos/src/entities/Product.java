package entities;

public class Product {

	// Attributes
	String name;
	private double price;
	private int quantity;

	// Contructors
	public Product() {
	}
	
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	/*
	 * O VALOR quantity SÓ PODE SER ALTERADO
	 * POR MEIO DE ENTRADA E SAÍDA DO PRODUTO
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	*/

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
		return String.format("%s, $ %.2f, %d units, Total: $ %.2f%n", name, price, quantity, totalValueInStock());
	}

}
