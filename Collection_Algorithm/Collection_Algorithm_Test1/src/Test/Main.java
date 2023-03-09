package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		int[] A = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			A[i] = random.nextInt(2001);
		}
		Set<Integer> setA = new HashSet<>();
		for (int num : A) {
			setA.add(num);
		}

		int[] B = new int[setA.size()];
		int i = 0;
		for (int num : setA) {
			B[i++] = num;
		}
		System.out.println(Arrays.toString(A));

		// b.Đếm
		Map<Integer, Integer> mapA = new HashMap<>();
		int maxCount = 0;
		int maxNum = 0;
		for (int num : A) {
			int count = mapA.getOrDefault(num, 0) + 1;
			mapA.put(num, count);
			if (count > maxCount) {
				maxCount = count;
				maxNum = num;
			}
		}
		
		System.out.println("Số lần số " +"'"+ maxNum+"'" + " xuất hiện là: " + maxCount);
		
		//c, tạo dãy C
		int[] C = new int[10000];
		for (int j = 0; j < C.length; j++) {
			C[j] = random.nextInt(2001) + 1000;
		}
		
		Set<Integer> setA1 = new HashSet<>();
		for (int num : A) {
			setA1.add(num);
		}
		int count =0;

		int[] marked = new int[2001];

		for (int num : C) {
		    if (num >= 0 && num <= 2000 && marked[num] == 0) {
		        if (mapA.containsKey(num)) {
		            count++;
		        }
		        marked[num] = 1;
		    }
		}

		System.out.println("Có " + count + " số xuất hiện trong A");
		
	}
}
