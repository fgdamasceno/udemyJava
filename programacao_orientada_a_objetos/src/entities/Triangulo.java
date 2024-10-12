package entities;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;
	
	// Methods
	public double calcularArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p -a) * (p - b) * (p - c));
	}
}
