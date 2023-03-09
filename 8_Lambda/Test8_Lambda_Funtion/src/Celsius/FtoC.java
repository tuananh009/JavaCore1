package Celsius;

import java.util.function.Function;

public class FtoC {
	public static void main(String[] args) {
		Function<Double, Double> fToC = f -> (f - 32) * 5/9;
		double fa = 95;
		double c = fToC.apply(fa);

		System.out.println("Độ F: " + fa + "\nĐộ C: " + c);
	}
}
