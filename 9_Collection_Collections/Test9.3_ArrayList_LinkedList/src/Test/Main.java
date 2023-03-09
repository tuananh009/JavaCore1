package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("C#");
		list.add(".Net");
		list.add("HTML");
		list.add("JS");
		
		System.out.println("For ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\nForeach ");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("\nIterator");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
