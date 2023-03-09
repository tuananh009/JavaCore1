package Bai9;

import java.util.ArrayList;

public class BienLai {
	private KhachHang kh;
	private float oldNumber;
	private float newNumber;
	private float price;
	private ArrayList<String> listBl = new ArrayList<>();
	
	public BienLai() {
		super();
	}
	public BienLai(KhachHang kh, float oldNumber, float newNumber, float price) {
		super();
		this.kh = kh;
		this.oldNumber = oldNumber;
		this.newNumber = newNumber;
		this.price = price;
	}
	public KhachHang getKh() {
		return kh;
	}
	public void setKh(KhachHang kh) {
		this.kh = kh;
	}
	public float getOldNumber() {
		return oldNumber;
	}
	public void setOldNumber(float oldNumber) {
		this.oldNumber = oldNumber;
	}
	public float getNewNumber() {
		return newNumber;
	}
	public void setNewNumber(float newNumber) {
		this.newNumber = newNumber;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = (this.newNumber - this.oldNumber)*5;
	}
	
	
	public int findIndexClient(String nameFind) {
		for (int i = 0; i < listBl.size(); i++) {
			String[] elements = listBl.get(i).split(" : ");
			String phoneName = elements[0];
			if(nameFind.equalsIgnoreCase(kh.getName())) {
				return i;
			}
		}
		return -1;

	}

	public void insertClient(String name, int number, int numberElectric,int oldNumber, int newNumber) {
		int index = findIndexClient(name);
		if(index == -1 ) {
			listBl.add(name + " : " + number + " : " + numberElectric + " : " + oldNumber + " : " + newNumber + " : " + price);
		}
	}
	
//	public void Display() {
//		System.out.print("Name : "+ this.kh.getName());
//		System.out.print("Number : "+ this.kh.getNumber());
//		System.out.print("Number Electric : "+ this.kh.getNumberElectric());
//		System.out.print("Old Price : "+this.oldNumber);
//		System.out.print("New Price : "+this.newNumber);
//		System.out.print("Price : "+this.price);
//	}
	
	public void updateClient(String nameUp, int newNumber, int newNumberElectric) {
		int index = findIndexClient(nameUp);
		if(index != 1) {
			String[] element = listBl.get(index).split(" : ");
			String newName = element[0];
			listBl.set(index, newName + " : " + newNumber + " : " + newNumberElectric);
		}
		
	}
	
	@Override
	public String toString() {
		return "BienLai [kh=" + kh + ", oldNumber=" + oldNumber + ", newNumber=" + newNumber + ", price=" + price
				+"]";
	}
	public void remove(String name) {
		int index = findIndexClient(name);
		if (index != 1 ) {
			listBl.remove(index);
		}
	}

}
