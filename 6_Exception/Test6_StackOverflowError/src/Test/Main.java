package Test;


public class Main {
	static void welCome() {
		System.out.println("Welcome ");
		welCome();
	}
	public static void main(String[] args) {
		welCome();
	}
}
