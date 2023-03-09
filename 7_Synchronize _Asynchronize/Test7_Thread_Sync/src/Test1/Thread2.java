package Test1;

import java.util.Random;

import Test.SharedData;

public class Thread2 extends Thread {
	SharedData sharedData;

	public Thread2(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (sharedData) {
				System.out.println("T2 > i > " + i);
				sharedData.notifyAll();
				try {
					sharedData.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int result = sharedData.rad * sharedData.rad;
				System.out.println("T2 > " + result);

			}

		}
	}
}
