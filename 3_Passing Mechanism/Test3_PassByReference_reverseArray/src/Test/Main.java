package Test;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println("Mảng trước khi Reverse: " + Arrays.toString(a));
		reverseArray(a);
		System.out.println("Mảng sau khi Reverse " + Arrays.toString(a));
	}

}
