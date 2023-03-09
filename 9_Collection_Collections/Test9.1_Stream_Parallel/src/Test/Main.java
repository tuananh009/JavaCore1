package Test;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<Integer> listNumber = new ArrayList<>();

		for (int i = 0; i < 10000000; i++) {
			listNumber.add(i);
		}
		long start1 = System.currentTimeMillis();
		long sum1 = usingStream(listNumber);
		long end1 = System.currentTimeMillis();
		
		System.out.println("Sum 1 = " + sum1 + " - Time: " + (end1-start1));

		long start2 = System.currentTimeMillis();		
		long sum2 = usingParallelStream(listNumber);
		long end2 = System.currentTimeMillis();
		
		System.out.println("Sum 2 = " + sum2 + " - Time: " + (end2-start2));
		
		
		
	}
	
	public static long usingStream(List<Integer> numbers) {
		return numbers.stream().filter(n -> n%2 ==0 ).mapToLong(Integer::intValue).sum();	
	}
	
	public static long usingParallelStream(List<Integer> numbers) {
		return numbers.parallelStream().filter(n -> n%2 ==0 ).mapToLong(Integer::intValue).sum();	
	}
}
