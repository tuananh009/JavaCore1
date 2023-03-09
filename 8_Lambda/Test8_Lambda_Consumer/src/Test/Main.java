package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<String> Liststr =	Arrays.asList("Java","Nguyen Tuan Anh","Khoai","Chao","NCCPLUS","Tố Hữu");
		
		Consumer<String> con = (String str) -> System.out.println("Chuỗi " + "'"+ str+"'" + " có độ dài lớn hơn 5");
		
		for (String string : Liststr) {
			if (string.length() > 5) {
				con.accept(string);
			}
		}
	}
}
