package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Java","is","easy","NTA","Nguyen","Tuan","Anh");
		int threshold = 4;
		List<String> list = new ArrayList<>();
		str.stream().filter(s -> s.length() == threshold).forEach(list::add);
		System.out.println("4 chữ cái: " + list);
 	}
}
