package Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
	public static Predicate<Employee> isMaleAdult(){
		return p -> p.getAge() > 20 && p.getGender().equalsIgnoreCase("M");
	}
	public static Predicate<Employee> isFeMaleAdult(){
		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}
	
	//Tìm tuôi lớn hơn age nhập vào
	public static Predicate<Employee> isMoreThanAge(Integer age){
		return p -> p.getAge() > age;
	}
	
	public static List<Employee> filterEmployee(List<Employee> emps, Predicate<Employee> preEmp){
		return emps.stream().filter(preEmp).collect(Collectors.<Employee>toList());
	}
	
	
}
