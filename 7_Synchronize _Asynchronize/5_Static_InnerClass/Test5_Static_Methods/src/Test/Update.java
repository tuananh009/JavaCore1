package Test;

public class Update {
	private String name;

	public Update(String name) {
		this.name = name;
	}
	
	static class myName{
		public static String MYNAME ;
	}
	
	public void print() {
		System.out.println("Name " + name);
		System.out.println("My Name " + myName.MYNAME);
	}
	
	public static void changeName(String name) {
		myName.MYNAME = name;
	}
	public static void main(String[] args) {
		Update up = new Update("Anh");
		up.changeName("Khoai");
		up.print();
		System.out.println("-------");
		changeName("Nguyễn Tuấn Anh");
		up.print();
	}
}
