package inc;

public class Test {
	private int n;
	
	public Test() {
		n = 3;
	}
	
	public void inc() {
		n++;
	}
	
	public int getN() {
		return n;
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.inc();
		t1.inc();
		Test t2 = new Test();
		t2.inc();
		Test t = new Test();
		System.out.println(t.getN());
		System.out.println(t1.getN());
//		System.out.println(t2.getN());
	}
}
