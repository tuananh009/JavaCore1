package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Access {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linkList = new LinkedList<>();
		
		for (int i = 0; i < 1000000; i++) {
			arrList.add(i);
			linkList.add(i);
		}
		
		long end,start, end1, start1;
		
		Random ran = new Random();
		int target = ran.nextInt(1000000);
		System.out.println(target);
		
		start = System.nanoTime();
		boolean findArr = arrList.contains(target);
		end = System.nanoTime();
		
		start1 = System.nanoTime();
		boolean findLink = linkList.contains(target);
		end1 = System.nanoTime();
		
		System.out.println("Time find ArrayList: " + (end - start));
		System.out.println("Time find LinkedList: " + (end1 - start1));
	}
}
