package ncc;

import java.util.ArrayList;
import java.util.Date;

public class SinhVienChinhQuy extends Student {

	public SinhVienChinhQuy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienChinhQuy(String stuId, String name, Date dob, int year, double point,
			ArrayList<KetQuaHocTap> kqht) {
		super(stuId, name, dob, year, point, kqht);
		// TODO Auto-generated constructor stub
	}

	public SinhVienChinhQuy(Student stu) {
		super(stu);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isChinhQuy() {
		return true;
	}
	
	

	

}
