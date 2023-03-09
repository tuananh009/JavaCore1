package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Product> map = new HashMap<>();
		map.put("P01", new Product("P01","Máy tính",53000));
		map.put("P02", new Product("P02","Gương chiếu yêu",299000));
		map.put("P03", new Product("P03","Bàn phím ",2000));
		map.put("P04", new Product("P04","tẩy",23300));
		
		List<Product> list = new ArrayList<>(map.values());
		
		Collections.sort(list,Comparator.comparing(Product::getPrice));
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
