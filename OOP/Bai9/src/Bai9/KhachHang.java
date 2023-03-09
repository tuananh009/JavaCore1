package Bai9;

import java.util.ArrayList;
import java.util.List;

public class KhachHang {
	private String name;
	private int number;
	private int numberElectric;
	private ArrayList<String> listCli = new ArrayList<>();
	
	public KhachHang() {
		super();
	}
	
	public KhachHang(String name, int number, int numberElectric) {
		super();
		this.name = name;
		this.number = number;
		this.numberElectric = numberElectric;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumberElectric() {
		return numberElectric;
	}

	public void setNumberElectric(int numberElectric) {
		this.numberElectric = numberElectric;
	}
	
	
	public int findIndexClient(String nameFind) {
		for (int i = 0; i < listCli.size(); i++) {
			String[] elements = listCli.get(i).split(" : ");
			String phoneName = elements[0];
			if(nameFind.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;

	}
	
	public void insertClient(String name, int number, int numberElectric,int oldNumber, int newNumber) {
		int index = findIndexClient(name);
		if(index == -1 ) {
			listCli.add(name + " : " + number + " : " + numberElectric);
		}
	}
	
	@Override
	public String toString() {
		return "KhachHang [name=" + name + ", number=" + number + ", numberElectric=" + numberElectric + ", listCli="
				+ listCli + "]";
	}
	
	
}
