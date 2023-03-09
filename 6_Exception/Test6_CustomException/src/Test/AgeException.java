package Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeException extends Exception {
	public AgeException(String input) {
		super(input);
	}
	
	@Override
	public String getMessage() {
		return "Lỗi nhập vào một tuổi: " + super.getMessage();
	}
	
	private static int inputAge() throws AgeException {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhập vào tuổi: ");
			int age = sc.nextInt();
			if (age <= 0 ) throw new AgeException("Tuổi phải lớn hơn 0");
			System.out.println("Tuổi đã nhập vào: " + age);
		} catch (InputMismatchException e) {
			System.out.println("Tuổi phải là số nguyên");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		while (true) {
			try {
				int age = inputAge();
				break;
			} catch (AgeException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}	
