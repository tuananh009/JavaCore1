package ArrayNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		Integer[] arr = { 1, 5, -6, -22, 6, 33, 55, 23, -333 };
		
		List<Integer> list = Arrays.asList(arr);
		
		Predicate<Integer> positiveNumber = num -> num >= 0;
		
		List<Integer> filteredList  = filterList(list, positiveNumber);
		
		System.out.println("Dãy ban đầu: " + list);
		System.out.println("Dãy không âm: " + filteredList );

	}

	private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
		List<T> filteredList = new ArrayList<>();
		for (T element : list) {
			if (predicate.test(element)) {
				filteredList.add(element);
			}
		}
		return filteredList;
	}
}
