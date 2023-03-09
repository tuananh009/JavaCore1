package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapToSet {
	public static void main(String[] args) {
		List<Map<Integer, String>> listMap = new ArrayList<>();
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map2.put(4, "D");
		map2.put(5, "E");
		map2.put(6, "F");
		listMap.add(map1);
		listMap.add(map2);
		System.out.println(listMap);
		
		Set<Map<Integer, String>> set = new HashSet<>();
		set.addAll(listMap);
		for (Map<Integer, String> map : set) {
			System.out.println(map);
		}
	}
}
