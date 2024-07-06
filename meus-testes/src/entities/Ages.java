package entities;

import java.time.Year;

public class Ages {

	private String name;
	private Integer birthYear;
	private Integer age;

	// CONSTRUCTORS
	public Ages() {
	}

	public Ages(String name, Integer birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	// METHODS
	public Integer calcAge() {
		return Year.now().getValue() - birthYear;
	}

	public String toString() {
		return name + " has " + calcAge() + " year.";
	}

}
