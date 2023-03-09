package Test;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		System.out.println("Trước khi đổi: " + Arrays.toString(a));
		updateArray(a);
		System.out.println("sau khi đổi" + Arrays.toString(a));
		Foo x = new Foo(1);
		Foo y = new Foo(1);
		System.out.println("Ban đầu: X: " + x.num);
		System.out.println("Ban đầu: Y: " + y.num);

		modify(x, y);

		System.out.println("X: " + x.num); // 2
		System.out.println("Y: " + y.num); // 1
	}

	/*
	 * Pass by reference truyền tham chiếu khi thay đổi giá trị của mảng sẽ được
	 * thay đổi trực tiếp trong bộ nhớ và ảnh hưởng đến giá trị của arr gốc truyền
	 * vào
	 */
	public static void updateArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		System.out.println("Thay đổi : " + Arrays.toString(arr));
	}

	/*
	 * Ví dụ 2 khi truyền tham chiếu sau khi modify() một bản sao của x và y được
	 * tạo ra và lưu vào stack x.num +=1 được thao tác trực tiếp trên heap nên được
	 * thay đổi nhưng y được tham chiếu tạo môi trường mới nên sau khi modify()
	 * không ảnh hưởng đến giá trị ban đầu
	 */
	public static void modify(Foo x, Foo y) {
		x.num += 1;
		y = new Foo(1);
		y.num++;
	}
}

class Foo {
	public int num;

	public Foo(int num) {
		this.num = num;
	}

}
