package Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		int length = 1000;
		StringBuilder str = new StringBuilder();
		StringBuffer strBu = new StringBuffer();

		ExecutorService executor = Executors.newFixedThreadPool(10);

		long start = System.currentTimeMillis();
		for (int i = 0; i < length; i++) {
			executor.execute(new Worker(length / 10, str));
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start) + " ms "+"String: " + str.toString());
		System.out.println(str.length());
		
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < length; i++) {
//			executor.execute(new Worker(length / 10, strBu));
//		}
//		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("Time: " + (end - start) + " ms "+"String: " + str.toString());
	}
}
