package Test;

import java.util.Iterator;

public class TestSleepThread extends Thread {
//	public void run() {
//		for (int i = 1; i < 5; i++) {
//
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
	
	public void run() {
		System.out.println("Thread name " + Thread.currentThread().getName());
		System.out.println("Thread Priority " + Thread.currentThread().getPriority());
	}

//	public void run() {
//		for (int i = 1; i < 5; i++) {
//			System.out.println(i);
//		}
//	}

	public static void main(String[] args) {
		TestSleepThread t1 = new TestSleepThread();
		TestSleepThread t2 = new TestSleepThread();
		TestSleepThread t3 = new TestSleepThread();
		
		//Đặt tên thread
//		System.out.println("Thread 1: "+t1.getName());
//		System.out.println("Thread 2: "+t2.getName());
//		t1.setName("Khoai");
//		System.out.println("Thread 1 after: "+t1.getName());
		
		//Set mức ưu tiên thread
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
//		try {
//			//join() đảm bảo luồng không bị gián đoạn bởi luồng khác
//			t1.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		t2.start();
		t3.start();
		
		
		// t1.start();
		// Không thể start thread 2 lần
		
		// gọi method run() trực tiếp mà không gọi thông qua start()
		// t1 được coi là đối tượng thông thường chứ không phải đối tượng luồng
//		t1.run();
//		t2.run();
	}
}
