package Test;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		long starTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("Hello");
		for (int i = 0; i < 100000; i++) {
			buffer.append(" World");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuffer is: " + (endTime - starTime)+"ms");
		
		long starTime1 = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("Hello");
		for (int i = 0; i < 100000; i++) {
			builder.append(" World");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("StringBuilder is: " + (endTime1 - starTime1)+"ms");
		
	}
}
