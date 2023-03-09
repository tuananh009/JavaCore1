package Thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start:... ");
		ThreadOne t1 = new ThreadOne();
		t1.start();
		
		ThreadTwo t2 = new ThreadTwo(t1);
		Thread t = new Thread(t2);
		t.start();
		
		System.out.println("Thực hiện join Thread 1 vào Thread Main");
		t1.join();
		System.out.println("Thực hiện join Thread 2 vào Thread 1");
		t.join();
		System.out.println("Thread main stop:... ");
//		try {
//			Thread.sleep(3000);
//			t1.stop();
//			t.stop();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
}
