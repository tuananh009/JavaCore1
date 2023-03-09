package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee(1, 21, "M", "Nguyễn ", "Anh"));
		listEmp.add(new Employee(2, 18, "M", "Hoàng ", "Trang"));
		listEmp.add(new Employee(3, 12, "F", "Đặng ", "Thảo"));
		listEmp.add(new Employee(4, 34, "F", "Dương ", "Nghĩa"));
		listEmp.add(new Employee(5, 4, "M", "Phạm ", "Thái"));
		listEmp.add(new Employee(6, 55, "F", "Trần ", "Yến"));
		listEmp.add(new Employee(7, 23, "M", "Lê", "Tùng"));
		
		System.out.println("Nam > 20 tuổi");
		System.out.println(EmployeePredicate.filterEmployee(listEmp,EmployeePredicate.isMaleAdult()));
		System.out.println("Nữ > 18 tuổi");
		System.out.println(EmployeePredicate.filterEmployee(listEmp,EmployeePredicate.isFeMaleAdult()));
		System.out.println("Người lớn hơn tuổi 25");
		System.out.println(EmployeePredicate.filterEmployee(listEmp,EmployeePredicate.isMoreThanAge(25)));
		
	}
}
