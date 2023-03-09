package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> listNumbers = Arrays.asList(1, 5, 7, 2, 12, 443, 12, 3, 55, 188, 55, 43, 76, 3, 2, 7, 7, 5);
		System.out.println("Dãy ban đầu");
		System.out.println(listNumbers);
		System.out.println("-----------------------------");
		// filter
		List<Integer> evenNumbers = listNumbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Số chẵn");
		System.out.println(evenNumbers);
		System.out.println("-----------------------------");

		// sorted
		List<Integer> sortNumbers = listNumbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sắp xếp tăng dần");
		System.out.println(sortNumbers);
		System.out.println("-----------------------------");

		// distinct
		List<Integer> onlyNumbers = listNumbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Lọc số trùng");
		System.out.println(onlyNumbers);
		System.out.println("-----------------------------");

		// limit
		List<Integer> limitNumbers = listNumbers.stream().limit(6).collect(Collectors.toList());
		System.out.println("6 số đầu tiên");
		System.out.println(limitNumbers);
		System.out.println("-----------------------------");

		// skip
		List<Integer> skipNumbers = listNumbers.stream().skip(6).collect(Collectors.toList());
		System.out.println("Bỏ qua 6 số đầu");
		System.out.println(skipNumbers);
		System.out.println("-----------------------------");

		// Đếm độ dài của từ
		System.out.println("Độ dài các từ");
		List<String> words = Arrays.asList("Java", "stream", "Hello", "is");
		List<Integer> wordlength = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Java -" + " stream -" + " Hello - " + "is");
		System.out.println(wordlength);
		System.out.println("-----------------------------");

	}
}
