package Test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private LocalDate year;
	private double gpa;
	private int credits;

	public Student(String id, String name, LocalDate localDate, double gpa, int credits) {
		super();
		this.id = id;
		this.name = name;
		this.year = localDate;
		this.gpa = gpa;
		this.credits = credits;
	}

	public Student() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public float getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", year=" + year + ", gpa=" + gpa + ", credits=" + credits
				+ "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.gpa == o.gpa) {
			return Integer.compare(this.credits, o.credits);
		}
		return Double.compare(this.gpa, o.gpa);
	}

}
