package ncc;

public class KetQuaHocTap {
	private String tenHocKy;
	private double diemTB;
	
	public KetQuaHocTap() {
	}
	
	public KetQuaHocTap(String tenHocKy, double diemTB) {
		this.tenHocKy = tenHocKy;
		this.diemTB = diemTB;
	}

	public KetQuaHocTap(KetQuaHocTap kq) {
		this.tenHocKy = tenHocKy;
		this.diemTB = diemTB;
	}

	public String getTenHocKy() {
		return tenHocKy;
	}

	public void setTenHocKy(String tenHocKy) {
		this.tenHocKy = tenHocKy;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	
	
	
}	
