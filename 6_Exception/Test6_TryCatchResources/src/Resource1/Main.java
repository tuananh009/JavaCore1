package Resource1;

import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\cumin\\eclipse-workspace\\Test6_TryCatchResources\\test.txt")) {
			String msg = "Xin chào Khoai";
			byte arr[]= msg.getBytes();
			fos.write(arr);
			System.out.println("Thông điệp đã được ghi vào file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
