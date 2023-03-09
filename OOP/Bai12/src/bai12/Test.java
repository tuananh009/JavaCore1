package bai12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyPhuongTienGT qlgt = new QuanLyPhuongTienGT();
		ArrayList<CongAn> listPT = new ArrayList<>();
		
		do {
			System.out.println("1. Thêm thông tin phương tiện");
			System.out.println("2. Xóa Phương tiện");
			System.out.println("3. Tìm kiếm Phương tiện theo hãng và màu");
			System.out.println("4. Thoát chương trình");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				
				System.out.println("Nhập ID");
				String id = sc.nextLine();
				System.out.println("Nhập Hãng sản xuất");
				String hangSx = sc.nextLine();
				System.out.println("Nhập năm sản xuất");
				String namSX = sc.nextLine();
				System.out.println("Nhập Giá Bán");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Nhập Màu Xe");
				String color = sc.nextLine();
				System.out.println("Nhập phương tiện: ");
				System.out.println("1. Xe ô tô");
				System.out.println("2. Xe Máy");
				System.out.println("3. Xe tải");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					System.out.println("Số chỗ ngồi: ");
					int soCho = Integer.parseInt(sc.nextLine());
					System.out.println("Kiểu động cơ");
					String dongCo = sc.nextLine();
					XeOTo oTo = new XeOTo(id, hangSx, namSX, price, color, soCho, dongCo);
					listPT.add(oTo);
					break;
				case 2:
					System.out.println("Công Xuất: ");
					String congXuat = sc.nextLine();
					XeMay xemay = new XeMay(id, hangSx, namSX, price, color, congXuat);
					listPT.add(xemay);
					break;
				case 3:
					System.out.println("Trọng Tải");
					String trongTai = sc.nextLine();
					XeTai xetai = new XeTai(id, hangSx, namSX, price, color, trongTai);
					listPT.add(xetai);
					break;
					}
				break;
			case 2:
				System.out.println("Nhập id cần xóa ");
				String idx = sc.nextLine();
				for (int i = 0; i < listPT.size(); i++) {
					if (listPT.get(i).equals(idx)) {
						listPT.remove(i);
					}
				}
				break;
			case 3:
				System.out.println("Nhập vào hãng cần tim: ");
				String hang = sc.nextLine();
				System.out.println("Nhập vào màu cần tim: ");
				String mau = sc.nextLine();
				qlgt.timPTTheoHangvaMau(hang, mau);
				break;
			}
		} while (true);
	}
}
