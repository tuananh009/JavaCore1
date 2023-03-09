package bai12;

public class XeMay extends CongAn {
	private String congXuat;

	public XeMay() {
		super();
	}

	public XeMay(String id, String hangSX, String namSX, double price, String color, String congXuat) {
		super(id, hangSX, namSX, price, color);
		this.congXuat = congXuat;
	}

	public String getCongXuat() {
		return congXuat;
	}

	public void setCongXuat(String congXuat) {
		this.congXuat = congXuat;
	}
	
	
}
