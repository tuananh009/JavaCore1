package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetToMap {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		
		Map<String, Integer> map = new HashMap<>();
		int i = 1;
		for (String string : set) {
			map.put(string, i++);
		}
		System.out.println(map);
	}
}
