package Test;

public class Main {
	private static String name;

	static {
		System.out.println("Khối static được gọi");
	}

	static {
		name = "Static Blocks được gọi";
	}

	Main() {
		System.out.println("hàm main() được gọi: ");
		System.out.println("Name= " + name);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}

}
