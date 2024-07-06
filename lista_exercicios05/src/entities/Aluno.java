package entities;

public class Aluno {
	
	public double a;
	public double b;
	public double c;
	
	public double grade() {
		return a + b + c;
	}
	
	public String approval() {
		double min = 60.00;
		double missingPoints = min - grade();
		
		if (grade() >= min) {
			return "PASS";
		}
		else {	
			return String.format("FAILED%nMISSING ") + String.format("%.2f", missingPoints) + " POINTS";
		}
	}

}
