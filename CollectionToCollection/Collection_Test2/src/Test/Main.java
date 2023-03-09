package Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Viết một chương trình Java để lưu trữ danh sách sinh viên bằng ArrayList, 
 * với mỗi sinh viên là một đối tượng Student chứa các thuộc tính: mã sinh 
 * viên, tên, ngày sinh, điểm trung bình và số tín chỉ. Sau đó, chuyển danh 
 * sách này sang một TreeSet chứa các đối tượng sinh viên và sắp xếp danh 
 * sách sinh viên theo thứ tự tăng dần theo điểm trung bình, nếu hai sinh 
 * viên có cùng điểm trung bình thì sắp xếp theo thứ tự tăng dần theo số 
 * tín chỉ. Tiếp theo, chuyển danh sách này sang một HashMap, với mã sinh 
 * viên là khóa và đối tượng Student là giá trị, và in ra danh sách sinh 
 * viên đã được lưu trữ trong HashMap theo thứ tự tăng dần theo mã sinh viên.*/

public class Main {
	public static void main(String[] args) {
		List<Student> listStu = new ArrayList<>();
		listStu.add(new Student("sv01", "Nguyen", LocalDate.of(1997, 12, 18),8.0, 36));
		listStu.add(new Student("sv02", "Tuan", LocalDate.of(1997, 9, 24),6.5, 48));
		listStu.add(new Student("sv03", "Anh", LocalDate.of(1997, 9, 1),6.5, 60));
		listStu.add(new Student("sv04", "Hoang", LocalDate.of(1997, 6, 27),7.0, 72));
		listStu.add(new Student("sv05", "Minh", LocalDate.of(1997, 11, 9),9.5, 84));
		
		Set<Student> stuSet = new TreeSet<>();
		stuSet.addAll(listStu);
		
		Map<String, Student> stuMap = new TreeMap<>();
		for (Student s : stuSet) {
			stuMap.put(s.getId(), s);
		}
		
		System.out.println("Danh Sách Sinh Viên: ");
		for (Map.Entry<String, Student> entry : stuMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

	}
}
