package Test;

import java.text.NumberFormat;
import java.util.Locale;

public class Product{
	private String id;
	private String name;
	private double price;
	private int amount;
	public Product(String id, String name, double price, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public Product() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		Locale lo = new Locale("vi","VN");
		NumberFormat num = NumberFormat.getInstance(lo);
		return id + ",\t" + name + ",\t" + num.format(price) + ", " + amount;
	}

	
	
}
