package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeMap;
/* Viết một chương trình Java để đọc một tệp văn bản chứa danh sách sản phẩm, mỗi sản phẩm được lưu trữ trên một dòng 
 * với các trường dữ liệu tách nhau bằng dấu phẩy. 
 * - Mỗi sản phẩm bao gồm các thuộc tính: mã sản phẩm, tên sản phẩm, giá bán và số lượng trong kho.
 * - Sau đó, chuyển danh sách sản phẩm sang một TreeMap chứa các đối tượng Product được sắp xếp theo giá bán tăng dần. 
 * - Tạo một ArrayList chứa các đối tượng Product và xóa các sản phẩm có số lượng trong kho bằng 0. 
 * - In ra danh sách sản phẩm đã sắp xếp theo giá bán tăng dần và danh sách sản phẩm còn lại sau khi xóa các sản 
 * phẩm có số lượng trong kho bằng 0.*/
public class Main {
	public static void main(String[] args) {

		ArrayList<Product> listPro = new ArrayList<>();
		try(BufferedReader bf = new BufferedReader(new FileReader("product.txt"))) {
			String line ;
			while ((line= bf.readLine()) != null) {
				String[] fields = line.split(",");
				String id = fields[0];
				String name = fields[1];
				double price = Double.parseDouble(fields[2]);
				int amount = Integer.parseInt(fields[3]);
				
				Product p = new Product(id, name, price, amount);
				listPro.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		TreeMap< Double, Product> sortPro = new TreeMap<>();
		for (Product product : listPro) {
			sortPro.put(product.getPrice(), product);
		}

		
		ArrayList<Product> rePro = new ArrayList<>();
		for (Product pro : listPro) {
			if (pro.getAmount() != 0) {
				rePro.add(pro);
			}
		}
		
		System.out.println("Danh sách theo giá tăng dần. ");
		for (Product p : sortPro.values()) {
			System.out.println(p);
		}
		System.out.println("-----------------------------");
		System.out.println("Danh sách sản phẩm còn lại");
		for (Product pr : rePro) {
			System.out.println(pr);
		}
		
		
	}
}
