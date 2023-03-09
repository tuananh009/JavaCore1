package Test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CustomerManager cu = new CustomerManager();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------");
			System.out.println("1- Thêm Khách Hàng");
			System.out.println("2- Xem Khách Hàng");
			System.out.println("3- Xóa Khách Hàng");
			System.out.println("0- Thoát");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				if (name.equals("exit")) {
					break;
				}
				System.out.print("Enter Type (1- regular,2- premium,3- vip): ");
				int typeCode = Integer.parseInt(sc.nextLine());
				CustomerType type;

				switch (typeCode) {
				case 1:
					type = CustomerType.REGULAR;
					break;
				case 2:
					type = CustomerType.PREMIUM;
					break;
				case 3:
					type = CustomerType.VIP;
					break;
				default:
					System.out.println("Invalid... ");
					continue;
				}
				cu.addCustomer(name, type);
				break;
				case 2:
					cu.displayCustomer();
					break;
				case 3:
					System.out.print("Enter delete name: ");
					String nameDel = sc.nextLine();
					cu.removeCustomer(nameDel);
					break;
				case 4:
					System.exit(0);
					break;
			default:
				break;
			}
			
			
		}
	}
}
