package Test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;

public class ArrayList_LinkedList {
	public static void main(String[] args) {
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getInstance(locale);
		ArrayList<Integer> arrList = new ArrayList<>();
		LinkedList<Integer> linList = new LinkedList<>();
		int n = 10000000;
		
		long startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			arrList.add(i);
		}
		long endTime = System.nanoTime();
		System.out.println("Time Array: \t" + nf.format((endTime-startTime)) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < n; i++) {
			linList.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time Linked: \t" + nf.format((endTime-startTime))+" ns");
	}
}
