package Test;

import java.util.Random;

public class Worker implements Runnable{
	private int length;
	private StringBuilder strBuilder;
	private StringBuffer strBuffer;
	public Worker(int length, StringBuffer strBuffer) {
		super();
		this.length = length;
		this.strBuffer = strBuffer;
	}
	public Worker() {
		super();
	}
	public Worker(int length, StringBuilder strBuilder) {
		super();
		this.length = length;
		this.strBuilder = strBuilder;
	}
	
	public void run() {
		Random r = new Random();
		for (int i = 0; i < length; i++) {
			char c = (char) (r.nextInt(26) + 'a');
			strBuilder.append(c);
		}
	}
}
