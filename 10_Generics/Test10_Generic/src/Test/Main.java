package Test;

public class Main {
	public static <E> void printArr(E[] element) {
		for (E e : element) {
			System.out.println(e + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6};
		Character[] cha = {'J','A','V','A'};
		
		System.out.println("In mảng số nguyên: ");
		printArr(arr);
		
		System.out.println("In mảng ký tự");
		printArr(cha);
		
	}
}
