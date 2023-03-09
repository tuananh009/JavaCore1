package Number;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Numbers {
	public static boolean isThanFifty(int n1,int n2) {
		return (n1 + n2) > 50;
	}
	
	public static List<Integer> findNumber(List<Integer> list, BiPredicate<Integer, Integer> pre){
		List<Integer> newList = new ArrayList<>();
		for (Integer string : list) {
			if (pre.test(string, string+10)) {
				newList.add(string);
			}

		}
		System.out.println(newList);
		return newList;
	}
}
