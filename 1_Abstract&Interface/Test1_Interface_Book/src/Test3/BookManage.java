package Test3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManage {
	public static void main(String[] args) {
		ArrayList<Book> listBook = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("   1. Insert new book\r\n"
					+ "   2. View list of books\r\n"
					+ "   3. Average Price\r\n"
					+ "   4. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				Book bo = new Book();
				System.out.print("Enter Name: ");
				bo.setName(sc.nextLine());
				System.out.print("Enter Publish Date: ");
				bo.setPublishDate(sc.nextLine());
				System.out.print("Enter Author: ");
				bo.setAuthor(sc.nextLine());
				System.out.print("Enter Language: ");
				bo.setLanguage(sc.nextLine());
				System.out.print("Enter Price: ");
				bo.setPriceList(new int[] {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()});
				listBook.add(bo);
				break;
			case 2:
				for (Book book : listBook) {
					book.Display();
				}
				break;
			case 3:
				for (Book book : listBook) {
					book.Calculate();
					book.Display();
				}
				break;
			case 4:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			}
		} while (true);
	}
}
