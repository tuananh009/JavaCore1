package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		
		String str = "Hello Everybody";
		Consumer<String> con = System.out::println;
		con.accept(str);
		
		List<String> str2 = Arrays.asList("NTA","Java","Khoai");
		str2.sort(String::compareToIgnoreCase);
		System.out.println(str2);
		
		List<String> str3 = Arrays.asList("1","2","3");
		
		List<Integer> numIntegers = str3.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(numIntegers);
	}
}
