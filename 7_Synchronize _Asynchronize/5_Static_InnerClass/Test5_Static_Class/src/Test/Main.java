package Test;

public class Main {
	private String name;

	public Main(String name) {
		this.name = name;
	}
	
	static class myName{
		public static String MYNAME = "NTA" ;
	}
	
	public void print() {
		System.out.println("Name " + name);
		System.out.println("My Name " + myName.MYNAME);
	}
	
	public static void changeName(String name) {
		myName.MYNAME = name;
	}
	public static void main(String[] args) {
		Main up = new Main("Anh");
		up.print();
	}
}
