package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> listStu = new ArrayList<>();
		listStu.add(new Student(1, "Nguyen", 8));
		listStu.add(new Student(2, "Tuan", 1));
		listStu.add(new Student(3, "Anh", 4));
		listStu.add(new Student(4, "Plus", 6));
		listStu.add(new Student(5, "NCC", 9));
		
		Collections.sort(listStu,(s1,s2) -> s1.getName().compareTo(s2.getName()));
		
		Consumer<Student> consumer = (Student stu) -> System.out.println(stu);
		
		System.out.println("Danh sách sắp xếp theo tên");
		listStu.forEach(consumer);
		
	}
}
