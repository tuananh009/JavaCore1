package Test;

public class Main {
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {1,6,34,54,5,66,775,3,2,22};
		System.out.println("số lớn nhất trong mảng là: " +findMax(a));
		
	}
}
