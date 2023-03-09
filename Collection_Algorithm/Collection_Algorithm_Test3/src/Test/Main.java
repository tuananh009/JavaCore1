package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10);
		}
//		int[] arr = {1,2,3,4,2,3,2,1,2,3,4,2};

		Map<Integer, Integer> mapArr = new HashMap<>();
//		int num = 0;
//		int count = 0;
		for (int i : arr) {
			int count1 = mapArr.getOrDefault(i, 0) + 1;
			mapArr.put(i, count1);
//			num = i;
//			count = count1;
		}
		System.out.println(Arrays.toString(arr));
		for (Entry<Integer, Integer> entry : mapArr.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Số '" + entry.getKey() +"' xuất hiện: " + entry.getValue());
			}
		}
		
		

	}
}
