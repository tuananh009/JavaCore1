package Test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		EnumSet<Fruit> fruitSet = EnumSet.noneOf(Fruit.class);
		EnumMap<Fruit, Integer> fruitMap = new EnumMap<>(Fruit.class);
		int n = 10;
		// thời gian sử dụng EnumSet đếm số lần xuất hiện giá trị
		long start = System.nanoTime();
		for (Fruit fruit : fruitSet) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (Fruit.values()[(int) (Math.random() * Fruit.values().length)] == fruit) {
					count++;
				}
			}
			fruitMap.put(fruit, count);
		}
		long end = System.nanoTime();
		long enumSetTime = end - start;
		System.out.println("Time Enum Set: " + enumSetTime);
		
		EnumMap<Fruit, Integer> fruitMap1 = new EnumMap<>(Fruit.class);
		long start1 = System.nanoTime();
		for (Fruit fruit : Fruit.values()) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (Fruit.values()[(int) (Math.random() * Fruit.values().length)] == fruit) {
					count++;
				}
			}
			fruitMap1.put(fruit, count);
		}
		long end1 = System.nanoTime();
		long enumMapTime = end1 - start1;
		System.out.println("Time Enum Set: " + enumMapTime);
	}


	public enum Fruit {
		APPLE, ORANGE, BANANA
	}
}
