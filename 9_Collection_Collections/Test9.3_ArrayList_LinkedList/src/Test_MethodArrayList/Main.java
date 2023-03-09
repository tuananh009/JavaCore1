package Test_MethodArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("C#");
		list.add(".Net");
		list.add("HTML");
		list.add("JS");

		List<String> list1 = new ArrayList<>();
		System.out.println("addAll: ");
		list1.addAll(list);
		System.out.println("List 1:");
		displayData(list1);

//		// Xóa phần tử không thuộc list2 ra khỏi list 1
//		System.out.println("\nretainAll: ");
//		List<String> list2 = new ArrayList<>();
//		list2.add("C++");
//		list2.add("Java");
//		list1.retainAll(list2);
//		System.out.println("List 1: ");
//		displayData(list1);
//		System.out.println("\nList 2: ");
//		displayData(list2);
//		// Remove xóa phần tử thuộc list 2 khỏi list
//		list.removeAll(list2);
//		System.out.println("\nList: ");
//		displayData(list);
		
		//contain
		System.out.println("\nContain:");
		System.out.println(list.contains("Java"));
		System.out.println(list.contains("C++"));

		// remove
		System.out.println("\nremove: ");
		list.remove(1);
		System.out.println("Xóa vị trí 2: ");
		System.out.println("List: ");
		displayData(list);

		// set
		System.out.println("\nCập nhật giá trị: ");
		list.set(2, "C++");
		displayData(list);

		// clear
		System.out.print("\nDanh sách list: ");
		list.clear();
		displayData(list);
		System.out.println("\nSố phần tử trong mảng: " + list.size());

	}

	public static void displayData(List<String> list) {
		for (String str : list) {
			System.out.print("\t" + str + ",");
		}
	}
}
