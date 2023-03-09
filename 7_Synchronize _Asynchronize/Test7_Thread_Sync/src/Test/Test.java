package Test;

public class Test {
	public static void main(String[] args) {
		SharedData sd = new SharedData();
		CustomData t1 = new CustomData(sd);
		CustomData t2 = new CustomData(sd);
		CustomData t3 = new CustomData(sd);
		CustomData t4 = new CustomData(sd);
		CustomData t5 = new CustomData(sd);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
