package MethodSupplier_TeminalOperations;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// foreach
		List<String> words = Arrays.asList("Java", "stream", "Hello", "is");
		words.stream().forEach(System.out::println);
		System.out.println("-----------------------------");
		
		//count
		int[] arr = {1,45,23,455,2332,6,7,88,7,56,799,2};
		System.out.println("Số chia hết cho 2 trong dãy " + Arrays.toString(arr));
		long countNumbers = Arrays.stream(arr).filter(x -> x%2==0).count();
		System.out.println(countNumbers + " Số");
		System.out.println("-----------------------------");
		
		//reduce
		List<Integer> listNumbers = Arrays.asList(66, 5, 7, 2, 12, 443, 12, 3, 55, 188, 55, 43, 76, 3, 2, 7, 7, 5);
		System.out.println("Sum của arr");
		int sum = listNumbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		System.out.println("-----------------------------");
		
		//min,Max
		int max = listNumbers.stream().max(Integer::compare).get();
		int min = listNumbers.stream().min(Integer::compare).get();
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("-----------------------------");
		
		//anyMatch
		boolean hasWord = words.stream().anyMatch(a -> a.equals("Java"));
		System.out.println(hasWord);
		System.out.println("-----------------------------");
		
		//allMatch
		boolean allOld = listNumbers.stream().allMatch(b -> b%2 != 0);
		System.out.println(allOld);
		System.out.println("-----------------------------");
		
		//noneMatch
		boolean allEven = listNumbers.stream().noneMatch(c -> c%2 ==0);
		System.out.println(allEven);
		System.out.println("-----------------------------");
		
		//findFirst , findAny
		Optional<Integer> findFirst = listNumbers.stream().filter(n -> n%2 == 0).findFirst();
		Optional<Integer> findAny = listNumbers.stream().filter(d -> d%2 == 0).findAny();
		System.out.println(findFirst);
		System.out.println(findAny);
		System.out.println("-----------------------------");
		
		//summarystatistics
		IntSummaryStatistics statis = listNumbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.print("Max: \t" + statis.getMax()+"\n");
		System.out.print("Min: \t" + statis.getMin()+"\n");
		System.out.print("Sum: \t" + statis.getSum()+"\n");
		System.out.print("Count: \t" + statis.getCount()+"\n");
		System.out.print("Average:" + statis.getAverage()+"\n");
		System.out.println("-----------------------------");
		
		//parallelStream
		System.out.println("Sum số chẵn");
		int sumEven = listNumbers.parallelStream().filter(x -> x %2 ==0).mapToInt(Integer::intValue).sum();
		System.out.println(sumEven);
		System.out.println("-----------------------------");
	}
}
