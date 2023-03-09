package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		BienLai bl = new BienLai();
		KhachHang kh = new KhachHang();
		ArrayList<BienLai> listBL = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Insert Client");
			System.out.println("2. Update Client");
			System.out.println("3. Remove Client");
			System.out.println("4. Calculate Electric");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Number: ");
				int number = Integer.parseInt(sc.nextLine());
				System.out.print("Enter Number Electric: ");
				int numberElec = Integer.parseInt(sc.nextLine());
				System.out.print("Enter Old Number: ");
				int oldNumber = Integer.parseInt(sc.nextLine());
				System.out.print("Enter New Number: ");
				int newNumber = Integer.parseInt(sc.nextLine());			
				bl.insertClient(name, number, numberElec,oldNumber,newNumber);
				bl.toString();
				break;
			case 2:
				System.out.print("Enter name update: ");
				String nameUP = sc.nextLine();
				System.out.print("Enter Number: ");
				int numberUp = Integer.parseInt(sc.nextLine());
				System.out.print("Enter Number Electric: ");
				int numberElecUp = Integer.parseInt(sc.nextLine());
				bl.updateClient(nameUP, numberUp, numberElecUp);
				break;
			case 3:
				System.out.println("Enter name remove");
				String nameRemove = sc.nextLine();
				bl.remove(nameRemove);
				break;
			case 4:
				for (BienLai bienLai : listBL) {
					bienLai.toString();
				}
				break;
			}
		} while (true);
	}
}
