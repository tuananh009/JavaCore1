package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 46, 12, 32, 4, 5, 46, 8, 585, 4, 43, 1, 2, 23, 5553, 2, 12123, 4, 355, 34, 223, 24, 23, 4, 4, 35,
				23, 23, 434 };
//		LinkedHashSet<Integer> arrSet = new LinkedHashSet<>();
//		LinkedHashMap<Integer, String> arrMap = new LinkedHashMap<>();
//
//		long startTime = System.nanoTime();
//		for (int i = 1; i < arr.length; i++) {
//			arrSet.add(i);
//		}
//		System.out.println(arrSet);
//		long endTime = System.nanoTime();
//		long timeSet = (endTime - startTime);
//		System.out.println("Time Set: " + timeSet);
//
//		long startTime1 = System.nanoTime();
//		for (Integer i : arr) {
//			arrMap.put(i, "value");
//		}
//		System.out.println(arrMap);
//		long endTime1 = System.nanoTime();
//		long timeMap = (endTime1 - startTime1);
//		System.out.println("Time Map: " + timeMap);
//
//		if (timeSet < timeMap) {
//			System.err.println("Set nhanh hơn Map");
//		} else
//			System.err.println("Map nhanh hơn Set");

//		LinkedHashSet<Integer> arrSet = new LinkedHashSet<>();
//		LinkedHashMap<Integer, Integer> arrMap = new LinkedHashMap<>();
//		
//		for (int i = 0; i < 10000000; i++) {
//			arrMap.put(i, i);
//			arrSet.add(i);
//		}
//		
//		long startTime = System.nanoTime();
//		boolean mapContain = arrMap.containsKey(500000);
//		long endTime = System.nanoTime();
//		
//		long timeMap = (endTime - startTime)/ 100;
//		
//		long startTime1 = System.nanoTime();
//		boolean setContain = arrSet.contains(500000);
//		long endTime1 = System.nanoTime();
//		
//		long timeSet = (endTime1-startTime1)/ 100;
//		
//		System.out.println("Time Map: " + timeMap);
//		System.out.println("Time Set: " + timeSet);
//		System.out.println();
//		if (timeSet < timeMap) {
//			System.err.println("Set nhanh hơn Map");
//		} else
//			System.err.println("Map nhanh hơn Set");

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

		int n = 100000;

		for (int i = 0; i < n; i++) {
			linkedHashMap.put(i, "Value " + i);
			linkedHashSet.add(i);
		}

		long startTime1 = System.nanoTime();
		for (int key : linkedHashMap.keySet()) {
			String value = linkedHashMap.get(key);
		}
		long endTime1 = System.nanoTime();
		long timeSet = (endTime1 - startTime1) / 1000000;

		long startTime2 = System.nanoTime();
		for (int element : linkedHashSet) {
			int value = element;
		}
		long endTime2 = System.nanoTime();
		long timeMap = (endTime2 - startTime2) / 1000000; 

		System.out.println("LinkedHashMap " + timeMap + "ms");
		System.out.println("LinkedHashSet " + timeSet + "ms");
		if (timeSet < timeMap) {
			System.err.println("Set nhanh hơn Map");
		} else
			System.err.println("Map nhanh hơn Set");

	}
}
