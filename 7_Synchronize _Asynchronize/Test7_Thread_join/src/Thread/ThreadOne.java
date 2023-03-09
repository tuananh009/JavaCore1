package Thread;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println("Thread 1 is running...");
		for (int i = 1; i < 10; i++) {
			try {
				System.out.println("Thread One > " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread 1 is ending...");
	}
}
