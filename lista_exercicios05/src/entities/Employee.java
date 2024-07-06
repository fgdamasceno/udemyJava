package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double raise = grossSalary + (grossSalary * (percentage / 100)) - tax;
		System.out.printf("%nUpdated data: %s, $ %.2f%n", name, raise);
	}

	public String employee() {
		return "Employee " + name + ", $ " + String.format("%.2f", netSalary());
	}
	
	
}
