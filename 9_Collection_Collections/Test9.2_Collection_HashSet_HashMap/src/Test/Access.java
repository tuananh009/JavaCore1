package Test;

import java.util.HashMap;
import java.util.HashSet;

public class Access {
	public static void main(String[] args) {
		HashSet<Integer> arrSet = new HashSet<>();
		HashMap<Integer, Integer> arrMap = new HashMap<>();
		
		for (int i = 0; i < 10000000; i++) {
			arrMap.put(i, i);
			arrSet.add(i);
		}
		
		long startTime = System.nanoTime();
		boolean mapContain = arrMap.containsKey(500000);
		long endTime = System.nanoTime();
		
		long timeMap = endTime - startTime;
		
		long startTime1 = System.nanoTime();
		boolean setContain = arrSet.contains(500000);
		long endTime1 = System.nanoTime();
		
		long timeSet = endTime1-startTime1;
		
		System.out.println("Time Map: " + timeMap);
		System.out.println("Time Set: " + timeSet);
		System.out.println();
		if (timeSet < timeMap) {
			System.err.println("Set nhanh hơn Map");
		} else
			System.err.println("Map nhanh hơn Set");
	}
}
