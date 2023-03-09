package bai11;

import java.util.Scanner;

public class SoPhuc {
	private double phanThuc;
	private double phanAo;
	public SoPhuc(double phanThuc, double phanAo) {
		super();
		this.phanThuc = phanThuc;
		this.phanAo = phanAo;
	}
	public SoPhuc() {
		super();
	}
	public double getPhanThuc() {
		return phanThuc;
	}
	public void setPhanThuc(double phanThuc) {
		this.phanThuc = phanThuc;
	}
	public double getPhanAo() {
		return phanAo;
	}
	public void setPhanAo(double phanAo) {
		this.phanAo = phanAo;
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập phần thực: ");
		this.phanThuc = Double.parseDouble(sc.nextLine());
		System.out.print("Nhập phần ảo: ");
		this.phanAo = Double.parseDouble(sc.nextLine());
	}
	
	public void display() {
		System.out.println(phanThuc + " + " + phanAo + "i");
	}
	
	public void sum(SoPhuc a, SoPhuc b) {
		SoPhuc sum = new SoPhuc();
		sum.phanThuc = a.phanThuc + b.phanThuc;
		sum.phanAo = a.phanAo + b.phanAo;
		System.out.println("Tong = " + sum.phanThuc + " + " + sum.phanAo +"i" );
	}
	public void mutil(SoPhuc a, SoPhuc b) {
		SoPhuc mutil = new SoPhuc();
		mutil.phanThuc = a.phanThuc * b.phanThuc;
		mutil.phanAo = a.phanAo * b.phanAo;
		System.out.println("Tong = " + mutil.phanThuc + " + " + mutil.phanAo +"i" );
	}
	
	public static void main(String[] args) {
		SoPhuc a = new SoPhuc();
		SoPhuc b = new SoPhuc();
		SoPhuc sp = new SoPhuc();
		a.inputData();
		b.inputData();
		a.display();
		b.display();
		
		sp.sum(a, b);
		sp.mutil(a, b);
		
	}
}
