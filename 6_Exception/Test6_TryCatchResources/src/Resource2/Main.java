package Resource2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		FileInputStream ios = null;
//		try {
//			fos = new FileOutputStream("C:\\Users\\cumin\\eclipse-workspace\\Test_TryCatchResources\\Test1.txt");
//			ios = new FileInputStream("C:\\Users\\cumin\\eclipse-workspace\\Test_TryCatchResources\\Test1.txt");
//			//ghi thông tin vào file
//			String msg = "Xin chào Khoai 1";
//			byte arr[]= msg.getBytes();
//			fos.write(arr);
//			System.out.println("Thông điệp đã được ghi vào file");
//			System.out.println(msg);
//			//đọc thông tin từ file 
//			DataInputStream dis = new DataInputStream(ios);
//			int data = ios.available();
//			byte[] arr2 = new byte[data];
//			dis.read(arr2);
//			String str = new String(arr2);
//			System.out.println("Dữ liệu đọc từ file. ");
//			System.out.println(str);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				fos.close();
//				ios.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\cumin\\eclipse-workspace\\Test6_TryCatchResources\\Test1.txt");
				FileInputStream ios  = new FileInputStream("C:\\Users\\cumin\\eclipse-workspace\\Test6_TryCatchResources\\Test1.txt")) {
			String msg = "Xin chào Khoai 1";
			byte arr[]= msg.getBytes();
			fos.write(arr);
			System.out.println("Thông điệp đã được ghi vào file");
			System.out.println(msg);
			//đọc thông tin từ file 
			DataInputStream dis = new DataInputStream(ios);
			int data = ios.available();
			byte[] arr2 = new byte[data];
			dis.read(arr2);
			String str = new String(arr2);
			System.out.println("Dữ liệu đọc từ file. ");
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
