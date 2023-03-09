package Test1;

import java.util.Random;

import Test.SharedData;

public class Thread1 extends Thread {
	SharedData sharedData;

	public Thread1(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public void run() {
		Random rm = new Random();
		for (int i = 0; i < 20; i++) {
			synchronized (sharedData) {
				System.out.println("T1 > i > " + i);
				int rad = rm.nextInt(100);
				sharedData.rad = rad;
				System.out.println("T1 > " + rad);

				sharedData.notifyAll();

				try {
					sharedData.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
