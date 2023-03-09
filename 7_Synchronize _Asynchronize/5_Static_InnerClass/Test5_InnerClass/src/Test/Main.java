package Test;

public class Main {
	private int varA;

	class B {
		int varB;

		public void displayB() {
			varB = 100;
			System.out.println("B = " + varB);
		}
	}

	protected class C {
		int varC;
		public void displayC() {
			varC = 1000001;
			System.out.println("C = " + varC);
			varA = 1555000;
			System.out.println("A = " + varA);
		}
	}

	public static void main(String[] args) {
		Main a = new Main();
		Main.B b = a.new B();
		Main.C c = a.new C();
		
		System.out.println("Lớp inner class B");
		b.displayB();
		System.out.println("Lớp inner class C");
		c.displayC();

	}
}
