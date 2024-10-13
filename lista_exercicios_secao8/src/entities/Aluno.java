package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String approval() {
		if (finalGrade() >= 60.0) {
			return String.format("FINAL GRADE: %.2f%nPASS", finalGrade());
		}
		else {
			double missingPoints = 60.0 - finalGrade();
			return String.format("FINAL GRADE: %.2f%nFAILED%nMISSING %.2f POINTS", finalGrade(), missingPoints);
		}
	}

}
