package Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		//chuyển từ String sang int
		Function<String, Integer> numberConverter = (str) ->
			Integer.parseInt(str);
		System.out.println(numberConverter.apply("100000"));
		
		//Chuyển từ kiểu Date sang String
		Function<LocalDate, String> dateConverter = (d) -> d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(dateConverter.apply(LocalDate.now()));
		
		//Chuyển đối tượng sang đối tượng
		Function<User, Member> objConverter = u  -> new Member(u.id, u.name);
		User user = new User(01, "Nguyễn Tuấn Anh", "Ninh Bình", 8.5);
		Member member = objConverter.apply(user);
		System.out.println(member);
	}
}
