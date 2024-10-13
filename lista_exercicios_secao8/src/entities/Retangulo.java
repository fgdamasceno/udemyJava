package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return this.width * 2 + this.height * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	}
	
	
	@Override
	public String toString() {
		return String.format("AREA: = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f", area(), perimeter(), diagonal());
	}
	
	

}
