package Thread;

import java.util.Iterator;

public class ThreadTwo implements Runnable{
	ThreadOne t1;
	
	public ThreadTwo(ThreadOne t1) {
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Thread 2 is running...");
		for (int i = 1; i < 10; i++) {
			try {
				System.out.println("Thread Two > " + i);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 is ending...");
		
	}

}
