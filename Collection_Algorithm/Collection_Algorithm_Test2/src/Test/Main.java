package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		List<Student> listStu = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			String code = "";
			for (int j = 0; j < 16; j++) {
				code += (char) (random.nextInt(26) + 'A');
			}
			String name = "student " + i;
			listStu.add(new Student(code,name));
		}

		System.out.println(listStu.get(0));
		System.out.println(listStu.get(1));
		System.out.println(listStu.get(2));
		System.out.println(listStu.get(3));
		System.out.println(listStu.get(4));
		System.out.println(listStu.get(5));

	}

	public static List<Student> getStudentIds(List<String> ids, List<Student> allStudents){
		List<Student> students = new ArrayList<>();
		for (String id : ids) {
			for (Student student : allStudents) {
				if (student.getStudent_code().equals(id)) {
					students.add(student);
				}
			}
		}
		return students;
	}
}
