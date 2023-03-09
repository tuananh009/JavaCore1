package bai12;

public class XeTai extends CongAn {
	private String trongTai;

	public XeTai() {
		super();
	}

	public XeTai(String id, String hangSX, String namSX, double price, String color, String trongTai) {
		super(id, hangSX, namSX, price, color);
		this.trongTai = trongTai;
	}

	public String getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(String trongTai) {
		this.trongTai = trongTai;
	}
	
	
}
