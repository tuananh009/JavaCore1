package Test;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start ... ");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("Thread 1 > " + i);
				}

			}
		});
		t1.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("Thread 2 > " + i);
				}

			}
		}).start();

		// lambda
		new Thread(() -> {
			for (int i = 0; i < 50; i++) {
				System.out.println("Thread 3 > " + i);
			}
		}).start();

		System.out.println("Ends...");
	}
}
