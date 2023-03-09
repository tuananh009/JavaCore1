package Test;

public class Main {
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Thay đổi: " + x + " - " + y);
	}
	public static void main(String[] args) {
		int x1 = 1;
		int y1 = 2;
		System.out.println("Trước khi thay đổi: " + x1 + " - " + y1);
		swap(x1, y1);
		System.out.println("Sau khi thay đổi: " + x1 + " - " + y1);
	}
	
	//Pass by value tạo ra biến sao chép khi không gọi đến swap thì sẽ trở lại giá trị ban đầu
	
}
