package Employee;

public class Main {
	    public static void main(String[] args) {
	        Employee e1 = new Employee("Anh", 25, 2000.0);
	        Employee e2 = new Employee("Tuấn", 30, 2500.0);
	        Employee e3 = new Employee("Nguyễn", 35, 3000.0);
	        Employee e4 = new Employee("Anh1",40 , 3500.0);
	        Employee e5 = new Employee("Tuấn1", 45, 4000.0);
	        Employee e6 = new Employee("Nguyễn1", 50, 4500.0);
	        System.out.println("Total Employees: " + Employee.getCount());
	        e1.display();
	        e2.display();
	        e3.display();
	        e4.display();
	        e5.display();
	        e6.display();
	    }
}
