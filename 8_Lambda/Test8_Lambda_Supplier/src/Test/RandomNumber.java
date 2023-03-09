package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
	public static void main(String[] args) {
		Supplier<Integer> randomSupNumbers = () -> {
			Random r = new Random();
			return r.nextInt(55) + 1;
		};
		
		List<Integer> randomNumbers = generateRandomNumber(randomSupNumbers, 6);
		System.out.print("Lấy số ngẫu nhiên: ");
		System.out.println(randomNumbers);
		
	}
	
	public static List<Integer> generateRandomNumber (Supplier<Integer> randomSupplier, int count){
		List<Integer> randomNumbers = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			randomNumbers.add(randomSupplier.get());
		}
		return randomNumbers;
	}
}
