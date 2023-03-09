package Number;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,2,4,53,1,232,22,333,2234,124);
		
		//anonymous class
		Numbers.findNumber(arr, new BiPredicate<Integer, Integer>() {
			
			@Override
			public boolean test(Integer t, Integer u) {
				return Numbers.isThanFifty(t, u);
			}
		});
		
		//Lambda Expression
		Numbers.findNumber(arr, (i1,i2) -> Numbers.isThanFifty(i1, i2));
		
		//Method Reference
		Numbers.findNumber(arr,Numbers::isThanFifty);
	}
}	
