package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaMain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "C#", "HTML", "JS");
		
		//list with Foreach
		list.forEach((element) -> System.out.println(element));
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		
		
//		//Anonymous class
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//
//		});
		System.out.println();
		//lambda với Comparator và Filter
		List<Product> listPro = new ArrayList<>();
		listPro.add(new Product(01, "Dell", 100000));
		listPro.add(new Product(02, "LG", 150000));
		listPro.add(new Product(03, "BenQ", 200000));
		listPro.add(new Product(04, "ASUS", 250000));
		listPro.add(new Product(05, "ACER", 300000));
		listPro.add(new Product(06, "Samsung", 350000));
		listPro.add(new Product(07, "Macbook", 400000));
		listPro.add(new Product(10, "HP", 450000));

		System.out.println("Sắp xếp các thông tin theo tên");
		
		Collections.sort(listPro, (p1,p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Product p : listPro) {
			System.out.println(p.id +"\t" + p.name + "\t" + p.price);
		}
		System.out.println();
		
		System.out.println("Những sản phẩm có giá lớn hơn 210k ");
		Stream<Product> filterData = listPro.stream().filter(p -> p.price >210000);
		filterData.forEach(pro -> {
			System.out.println(pro.name + "\t" + " : "  + "\t" + pro.price);
		});
		System.out.println();

		// lambda
		Collections.sort(list, (String o1, String o2) -> {
			return o1.compareTo(o2);
		});

		for (String string : list) {
			System.out.println(string);
		}

		// Funtional Interface không có tham số
		Text t = () -> {
			return "Nói gì đó..";
		};
		System.out.println(t.speak());

		// funtional Interface có 1 tham số
		Text2 t2 = (name) -> {
			return "Hello" + name;
		};
		System.out.println(t2.speak(" Khoai"));

		// funtional Interface có 2 tham số
		Add a = (a1, b) -> (a1 + b);
		System.out.println(a.add(10, 20));
	}
}
