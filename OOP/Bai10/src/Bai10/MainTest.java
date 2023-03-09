package Bai10;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào chuỗi: ");
		String inputVB = sc.nextLine();
		VanBan vb = new VanBan();
		System.out.println("Số từ trong chuỗi:" + vb.count(inputVB));
		System.out.println("Số Ký tự A trong chuỗi: " + vb.countA(inputVB));
		String str = vb.chuanhoa(inputVB);
		System.out.println("Chuỗi sau khi chuẩn hóa: " + str);

	}
}
