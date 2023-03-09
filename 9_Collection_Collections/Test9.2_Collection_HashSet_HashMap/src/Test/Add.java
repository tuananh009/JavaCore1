package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Add {
	public static void main(String[] args) {
		HashSet<String> arrSet = new HashSet<>();
		HashMap<String, Integer> arrMap = new HashMap<>();
		
		long startTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			arrSet.add("Number " + i);
		}
		long endTime = System.nanoTime();
		long timeMap =  endTime - startTime;
		System.out.println("Time HashSet: " + (endTime - startTime));
		
		long startTime1 = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			arrMap.put("Number " + i, i);
		}
		long endTime1 = System.nanoTime();
		long timeSet =  endTime1 - startTime1;
		System.out.println("Time HashMap: " + (endTime - startTime));
		
		if (timeSet < timeMap) {
			System.err.println("Set nhanh hơn Map");
		} else
			System.err.println("Map nhanh hơn Set");
	}
}
