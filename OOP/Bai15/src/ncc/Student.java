package ncc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Student {
	private String stuId;
	private String name;
	private Date dob;
	private int year;
	private double point;
	private ArrayList<KetQuaHocTap> kqht;

	public Student() {
		kqht = new ArrayList<>();
	}

	public Student(String stuId, String name, Date dob, int year, double point, ArrayList<KetQuaHocTap> kqht) {
		this.stuId = stuId;
		this.name = name;
		this.dob = dob;
		this.year = year;
		this.point = point;
		this.kqht = kqht;
	}

	public Student(Student stu) {
		this.stuId = stuId;
		this.name = name;
		this.dob = dob;
		this.year = year;
		this.point = point;
		this.kqht = kqht;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public ArrayList<KetQuaHocTap> getKqht() {
		return kqht;
	}

	public void setKqht(ArrayList<KetQuaHocTap> kqht) {
		this.kqht = kqht;
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Mã Sinh Viên");
		stuId = sc.nextLine();
		System.out.println("Nhập Tên Sinh Viên");
		name = sc.nextLine();
		System.out.println("Nhập Ngày Sinh");
		String dobStr = sc.nextLine();
		try {
			dob = new SimpleDateFormat("dd/MM/yyyy").parse(dobStr);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Nhập Năm Nhập Học");
		year = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập Điểm đầu vào Sinh Viên");
		point = Double.parseDouble(sc.nextLine());
	}

	public String outputData() {
		return "Student [stuId=" + stuId + ", name=" + name + ", dob=" + dob + ", year=" + year + ", point=" + point
				+ "]";
	}

	public boolean isChinhQuy() {
		return true;
	}

	public double tinhDTB(String hocKy) {
		double sum = 0;
		int count = 0;
		for (KetQuaHocTap ketQua : kqht) {
			if (ketQua.getTenHocKy().equals(hocKy)) {
				sum += ketQua.getDiemTB();
				count++;
			}
		}
		if (count == 0) {
			throw new IllegalAccessError("Không tìm thấy học kỳ nào.");
		}
		return sum / count;
	}

}
