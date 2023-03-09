package bai12;

public class XeOTo extends CongAn {
	private int soChoNgoi;
	private String kieuDongCo;
	public XeOTo() {
		super();
	}
	public XeOTo(String id, String hangSX, String namSX, double price, String color, int soChoNgoi, String kieuDongCo) {
		super(id, hangSX, namSX, price, color);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	
	
}
