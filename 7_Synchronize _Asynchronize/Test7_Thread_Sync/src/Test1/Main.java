package Test1;

import Test.SharedData;

public class Main {
	public static void main(String[] args) {
		SharedData sd = new SharedData();
		Thread1 t1 = new Thread1(sd);
		Thread2 t2 = new Thread2(sd);
		
		t1.start();
		t2.start();
	}
}
