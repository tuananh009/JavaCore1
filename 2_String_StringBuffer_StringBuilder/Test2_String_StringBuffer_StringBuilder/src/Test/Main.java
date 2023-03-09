package Test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String str = sc.nextLine();

		// String
		long startTime = System.nanoTime();
		String reverse = reverseString(str);
		long endTime = System.nanoTime();
		long time = endTime - startTime;
//		System.out.println("Chuỗi sau khi đảo: " + reverse);
		System.out.println("Thời gian sử dụng String: " + time  + " nanoseconds");

		// String Buffer
		long startTime2 = System.nanoTime();
		String reverseBuffer = reverseStringBuffer(str);
		long endTime2 = System.nanoTime();
		long time2 = endTime2 - startTime2;
//		System.out.println("Chuỗi sau khi đảo: " + reverseBuffer);
		System.out.println("Thời gian sử dụng String Buffer: " + time2  + " nanoseconds");

		// String Buffer
		long startTime3 = System.nanoTime();
		String reverseBuilder = reverseStringBuilder(str);
		long endTime3 = System.nanoTime();
		long time3 = endTime3 - startTime3;
//		System.out.println("Chuỗi sau khi đảo: " + reverseBuilder);
		System.out.println("Thời gian sử dụng String Builder: " + time3  + " nanoseconds");

		
		//String Buffer
		StringBuffer strBuf = new StringBuffer(str);
		char ch = 'a';
		startTime = System.nanoTime();
		int index = -1;
		for (int i = 0; i < strBuf.length(); i++) {
			if (strBuf.charAt(i) == ch) {
				index = i;
				break;
			}
		}

		endTime = System.nanoTime();

		if (index >= 0) {
			System.out.println("Kí tự '" + ch + "' ở vị trí " + index);
		} else {
			System.out.println(""
					+ "kí tự '" + ch + "' không có trong chuỗi");
		}

		System.out.println(
				"Thời gian tìm kiếm StringBuffer: " + (endTime - startTime) + " nanoseconds");
		
		//String Builder
		StringBuilder strBul = new StringBuilder(str);
		char ch1 = 'a';
		startTime = System.nanoTime();
		int index1 = -1;
		for (int i = 0; i < strBul.length(); i++) {
			if (strBul.charAt(i) == ch1) {
				index1 = i;
				break;
			}
		}
		endTime = System.nanoTime();
		if (index >= 0) {
			System.out.println("Kí Tự '" + ch + "' ở vị trí " + index);
		} else {
			System.out.println("Kí tự '" + ch + "' không có trong chuỗi.");
		}

		System.out.println(
				""
				+ "Thời gian tìm kiếm StringBuilder: " + (endTime - startTime) + " nanoseconds");
	}

	public static String reverseString(String str) {
		String reversedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}

	public static String reverseStringBuffer(String str) {
		StringBuffer strBuf = new StringBuffer(str);
		return strBuf.reverse().toString();
	}

	public static String reverseStringBuilder(String str) {
		StringBuilder strBul = new StringBuilder(str);
		return strBul.reverse().toString();
	}
}
