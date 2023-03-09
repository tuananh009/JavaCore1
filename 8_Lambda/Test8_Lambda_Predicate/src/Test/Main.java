package Test;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Predicate<String> pre = s -> s.equals("Nguyễn Tuấn Anh");
		
		Predicate<String> preAnd = pre.and(s -> s.length() > 10);
		System.out.println(preAnd.test("Nguyễn Tuấn Anh"));
		
		Predicate<String> preOr = pre.or(s -> s.length() > 11);
		System.out.println(preOr.test("Nguyễn Tuan Anh"));
		
		Predicate<String> preNagate = pre.negate();
		System.out.println(preNagate.test("Nguyễn Tuấn Anh"));
		
	}
}
