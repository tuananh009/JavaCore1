package Student;

public class Student {
	private String id;
	private static String name;
	private int age;
	private double gpa;

	public Student(String id, String name, int age, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public void showProfile() {
		System.out.printf("|%s||%s| \t | %d ||%.2f| ", id, name, age, gpa);
	}
}
