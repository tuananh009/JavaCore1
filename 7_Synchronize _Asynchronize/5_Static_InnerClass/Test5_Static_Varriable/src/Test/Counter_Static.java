package Test;

public class Counter_Static {

	/*
	 * Biến static chỉ lấy bộ nhớ một lần nên bất cứ đối tượng nào thay đổi biến
	 * static nó vẫn ghi nhớ giá trị trước đó
	 */
	static int count = 0;

	public Counter_Static() {
	}

	public void print() {
		System.out.println("count= " + count);
	}

	public void visit() {
		count++;
		this.print();
	}

	public static void main(String[] args) {
		Counter_Static c1 = new Counter_Static();
		c1.visit();
		Counter_Static c2 = new Counter_Static();
		c2.visit();
		Counter_Static c3 = new Counter_Static();
		c3.visit();
	}
}
