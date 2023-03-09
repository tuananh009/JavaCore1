package Test;

public class ThreadPool implements Runnable {
	private String msg;

	public ThreadPool(String msg) {
		this.msg = msg;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message= " + msg );
		System.out.println(Thread.currentThread().getName() + " (End) ");
	}
	
	public void processThread() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
