package Test2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<News> listNew = new ArrayList<>();
		
		
		do {
			System.out.println("1. Insert View");
			System.out.println("2. View List News");
			System.out.println("3. Avarage View");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				News ne = new News();
				System.out.print("Enter Title: ");
				ne.setTitle(sc.nextLine());
				System.out.print("Enter Publish Date: ");
				ne.setPublishDate(sc.nextLine());
				System.out.print("Enter Author: ");
				ne.setAuthor(sc.nextLine());
				System.out.print("Enter Content: ");
				ne.setContent(sc.nextLine());
				System.out.print("Enter Rate List: ");
				ne.setRateList(new int[] {sc.nextInt(),sc.nextInt(),sc.nextInt()});
				listNew.add(ne);
				break;
			case 2:
				for (News news : listNew) {
					news.Display();
				}
				break;
			case 3:
				for (News news : listNew) {
					news.Caculate();
					news.Display();
				}
				break;
			case 4:
				System.out.println("GoodBye!");
				System.exit(0);
				break;
			}
		} while (true);

		
		
	}
}
