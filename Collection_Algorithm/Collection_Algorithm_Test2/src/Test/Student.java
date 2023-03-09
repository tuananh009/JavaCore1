package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
	private String student_code;
	private String name;

	public Student() {
		super();
	}

	public Student(String student_code, String name) {
		super();
		this.student_code = student_code;
		this.name = name;
	}

	public String getStudent_code() {
		return student_code;
	}

	public void setStudent_code(String student_code) {
		this.student_code = student_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [student_code=" + student_code + ", name=" + name + "]";
	}

}
