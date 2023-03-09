package Test;

import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		try {
			try {
				System.out.println("Thuc hien phep chia");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
//				e.getMessage();
			} finally {
				System.out.println("-----Khối finally---------");
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			int c = 32 / 0;
			System.out.println("Kết quả C= " + c);
			System.out.println("khoi lenh khac");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("xy ly ngoai le");
		} finally {
			System.out.println("Chồn chồn");
		}

		System.out.println("tiep tuc chuong trinh..");
		System.out.println();
		validate(13);
		System.out.println("Reset");
		System.out.println();
		c();
		System.out.println("Luồng bình thường....");
	}

	// Throw
	// throw sử dụng để ném ra ngoại lệ cụ thể
	public static void validate(int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException("Không hợp lệ");
			} else {
				System.out.println("Welcome");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Throws
	// throws được sử dụng để xử lý ngoại lệ
	public static void a() throws IOException {
		throw new IOException("Lỗi ");
	}

	public static void b() throws IOException {
		a();
	}

	public static void c() {
		try {
			b();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ngoại lệ được xử lý");
	}

}
