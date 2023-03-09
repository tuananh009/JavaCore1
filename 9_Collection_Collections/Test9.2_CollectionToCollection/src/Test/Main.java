package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		//List to Set
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		//List to Map
		Map<Integer, Integer> map = new HashMap<>();
		int i = 1;
		for (Integer in : list) {
			map.put(in, i++);
		}
		System.out.println(map);
		
		//Array to ArrayList
		String[] arr = {"A","B","C"};
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println(list1);
		
		//ArrayList to Array
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		String[] arr2 = list2.toArray(new String[list2.size()]);
		
		//HashMap to ArrayList
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("C", 1);
		map1.put("D", 2);
		map1.put("E", 3);
		ArrayList<String> list3 = new ArrayList<>(map1.keySet());
		
		System.out.println(list3);
	}
}
