package Test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Random;

public class LinkedList_ArrayList {
	public static void main(String[] args) {
		Locale lo = new Locale("vi", "VN");
		NumberFormat num = NumberFormat.getInstance(lo);
		ArrayList<Integer> arrlist = new ArrayList<>();
		LinkedList<Integer> linList = new LinkedList<>();

		for (int i = 0; i < 1000000; i++) {
			arrlist.add(i);
			linList.add(i);
		}

		int index = new Random().nextInt(99999);
		int value = new Random().nextInt(9999);
		
		System.out.println("index: " + index + " Value: " + value);
		// chèn phần tử vào giữa danh sách
		long startTime = System.nanoTime();
		arrlist.add(index, value);
		long endTime = System.nanoTime();
		System.out.println("Chèn Array: " + num.format((endTime - startTime))+" ns");

		startTime = System.nanoTime();
		linList.add(index, value);
		endTime = System.nanoTime();
		System.out.println("Chèn Linked: " +  num.format((endTime - startTime))+" ns");
		
		System.out.println("--------------------------------");
		//xóa phần tử giữ mảng
		startTime = System.nanoTime();
		arrlist.remove(index);
		endTime = System.nanoTime();
		System.out.println("Xóa Array: " +  num.format((endTime - startTime))+" ns");
		
		startTime = System.nanoTime();
		linList.remove(index);
		endTime = System.nanoTime();
		System.out.println("Xóa Linked: " +  num.format((endTime - startTime))+" ns");
	}
}
