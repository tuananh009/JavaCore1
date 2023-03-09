package ncc;

import java.util.ArrayList;
import java.util.Date;

public class SinhVienTaiChuc extends Student {
	private String noiLienKet;

	public SinhVienTaiChuc() {
		super();
	}

	public SinhVienTaiChuc(String stuId, String name, Date dob, int year, double point, ArrayList<KetQuaHocTap> kqht,
			String noiLienKet) {
		super(stuId, name, dob, year, point, kqht);
		this.noiLienKet = noiLienKet;
	}

	public SinhVienTaiChuc(Student stu) {
		super(stu);
	}
	
	
	
}
