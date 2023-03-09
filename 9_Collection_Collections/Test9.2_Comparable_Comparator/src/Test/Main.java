package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		List<Student> list = generateRandomStudent(100000);
		
		long start1 = System.currentTimeMillis();
		Collections.sort(list);
		long end1 = System.currentTimeMillis();
		System.out.println("Comparable: " + (end1 - start1) + " ms");
		
		GpaComparator gpa = new GpaComparator();
		long start2 = System.currentTimeMillis();
		Collections.sort(list, gpa);;
		long end2 = System.currentTimeMillis();
		System.out.println("Comparator: " + (end2 - start2)+ " ms");
		
	}
	private static List<Student> generateRandomStudent(int size) {
        List<Student> studentList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            studentList.add(new Student("Student" + i, random.nextInt(30) + 18, random.nextDouble() * 4.0));
        }
        return studentList;
    }
}
