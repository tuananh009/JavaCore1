package Student;

public class StudentManage {
	public static void main(String[] args) {
		Student anh = new Student("sv01", "Tuấn Anh", 1991, 8.11);
		Student tuan = new Student("sv02", "Anh Tuấn", 1992, 2.22);
//		Student khoai = new Student("sv03", "khoai", 1993, 6.33);
		
		
		System.out.print("Anh :");
		anh.showProfile();
		System.out.println();
		System.out.print("Tuấn :");
		tuan.showProfile();
	}
}
