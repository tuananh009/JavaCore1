package Test;

import java.util.ArrayList;
import java.util.Random;

public class Thread2 extends Thread {
	ArrayList<Character> list2 = new ArrayList<>();
	
	@Override
	public void run() {
		Random r = new Random();
		int min = (int) 'a';
		int max = (int) 'z';
		int limit = max - min;
		System.out.println(min);
		System.out.println(max);
		for (int i = 0; i < 10; i++) {
			int ranChar = r.nextInt(limit) + min;
			char c = (char) ranChar;
			list2.add(c);
			
			System.out.println("t2_"  + (i+1)  + " > " + c);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
