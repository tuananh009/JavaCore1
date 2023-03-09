package Test;

import java.util.ArrayList;
import java.util.Random;

public class Thread1 extends Thread {
	ArrayList<Integer> list1 = new ArrayList<>();
	@Override
	public void run() {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int ranNum = r.nextInt(100);
			list1.add(ranNum);
			
			System.out.println("t1_" + (i+1) + " > "+ ranNum);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
