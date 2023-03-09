package bai12;

public class CongAn {
	private String id;
	private String hangSX;
	private String namSX;
	private double price;
	private String color;
	public CongAn() {
		super();
	}
	public CongAn(String id, String hangSX, String namSX, double price, String color) {
		super();
		this.id = id;
		this.hangSX = hangSX;
		this.namSX = namSX;
		this.price = price;
		this.color = color;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public String getNamSX() {
		return namSX;
	}
	public void setNamSX(String namSX) {
		this.namSX = namSX;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
