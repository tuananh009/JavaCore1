package Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable run = new ThreadPool("" + i);
			threadPool.execute(run);
		}
		threadPool.shutdown();
		while (!threadPool.isTerminated()) {
		}
		System.out.println("Finish....");
	}
}
