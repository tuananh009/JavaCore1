package AbstractClass;

import java.util.List;
import java.util.Scanner;

public class ManagePhoneBook {


	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Insert Phone");
			System.out.println("2. Remove Phone");
			System.out.println("3. Update Phone");
			System.out.println("4. Search Phone");
			System.out.println("5. Sort Phone");
			System.out.println("6. List Phone");
			System.out.println("7. Exit");
			
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				System.out.print("Enter Phone Number: ");
				String phone = sc.nextLine();
				pb.insertPhone(name, phone);
				break;
			case 2:
				System.out.print("Enter name delete: ");
				String nameDel = sc.nextLine();
				System.out.println();
				pb.removePhone(nameDel);
				break;
			case 3:
				System.out.print("Enter name: ");
				String nameUp = sc.nextLine();
				System.out.print("Enter phone update: ");
				String newPhone = sc.nextLine();
				pb.updatePhone(nameUp, newPhone);
				break;
			case 4:
				System.out.print("Enter name search: ");
				String nameSearch = sc.nextLine();
				pb.searchPhone(nameSearch);
				break;
			case 5:
				pb.sortPhone();
				break;
			case 6:
				
				break;
			case 7:
				System.exit(0);
				break;
			}
		} while (true);
	}


}
