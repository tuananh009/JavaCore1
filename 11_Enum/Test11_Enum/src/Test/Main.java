package Test;

public class Main {
	public enum Weekdays {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	public static void main(String[] args) {
		for (Weekdays we : Weekdays.values()) {
			System.out.println(we);
		}
	}
}
