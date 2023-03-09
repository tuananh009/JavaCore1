package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		String[] words = { "i", "love", "you", "and", "you", "don't", "love", "me","ha","ha","ha" };
		Map<String, Integer> map = new HashMap<>();
		String word = "";
		int count = 0;
		for (String str : words) {
			int count1 = map.getOrDefault(str, 0) + 1;
			map.put(str, count1);
			word = str;
			count = count1;

		}
		Map<String, Integer> map2 = new HashMap<>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 2) {
				map2.put(entry.getKey(), entry.getValue());
			}
			
		}
		
		Set<String> set = map2.keySet();
		String[] keySet = set.toArray(new String[set.size()]);
		System.out.println(Arrays.toString(keySet));
	}
}
