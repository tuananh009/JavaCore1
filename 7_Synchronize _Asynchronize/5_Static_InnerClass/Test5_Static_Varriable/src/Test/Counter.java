package Test;

public class Counter {

	/*
	 * Biến count lấy bộ nhớ tại thời điểm tạo đối tượng, mỗi đối tượng sẽ có bản
	 * sao của biến instance. Nếu biến count được tăng lên thì không ảnh hưởng đến
	 * đối tượng khác
	 */
	int count = 0;

	public Counter() {
		super();
	}

	public void print() {
		System.out.println("count= " + count);
	}

	public void visit() {
		count++;
		this.print();
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.visit();
		Counter c2 = new Counter();
		c2.visit();
		Counter c3 = new Counter();
		c3.visit();
	}
}
