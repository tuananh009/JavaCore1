package bai12;

import java.util.ArrayList;

public class QuanLyPhuongTienGT {
	private ArrayList<CongAn> listPT;
	private ArrayList<XeOTo> listOTo;
	private ArrayList<XeMay> listxeMay;
	private ArrayList<XeTai> listxeTai;
	
	public QuanLyPhuongTienGT(){
		listOTo = new ArrayList<>();
		listxeMay = new ArrayList<>();
		listxeTai = new ArrayList<>();
	}
	
	public void themOto(XeOTo oTo) {
		listOTo.add(oTo);
	}
	
	public void themXeMay(XeMay xeMay) {
		listxeMay.add(xeMay);
	}
	
	public void themXeTai(XeTai xeTai) {
		listxeTai.add(xeTai);
	}
	
	public void removeOTo(String id) {
		for (int i = 0; i < listOTo.size(); i++) {
			if (listOTo.get(i).getId().equals(id)) {
				listOTo.remove(i);
			} 
		}
	}
	public void removeXeMay(String id) {
		for (int i = 0; i < listxeMay.size(); i++) {
			if (listOTo.get(i).getId().equals(id)) {
				listOTo.remove(i);
			} 
		}
	}
	public void removeXeTai(String id) {
		for (int i = 0; i < listxeTai.size(); i++) {
			if (listOTo.get(i).getId().equals(id)) {
				listOTo.remove(i);
			} 
		}
	}
	
	public void timPTTheoHangvaMau(String hangSX, String mau) {
		  for (CongAn ptgt : listPT) {
		        if (ptgt.getHangSX().equalsIgnoreCase(hangSX) && ptgt.getColor().equalsIgnoreCase(mau)) {
		            System.out.println(ptgt.toString());
		        }
		    }
	}
	
//	public ArrayList<XeOTo> timOtoTheoHangSXVaMau(String hangSX, String mau) {
//        ArrayList<XeOTo> ketQua = new ArrayList<>();
//        for (XeOTo oto : listOTo) {
//            if (oto.getHangSX().equals(hangSX) && oto.getColor().equals(mau)) {
//                ketQua.add(oto);
//            }
//        }
//        return ketQua;
//    }
//	
//	public ArrayList<XeMay> timXeMayTheoHangSXVaMau(String hangSX, String mau) {
//        ArrayList<XeMay> ketQua = new ArrayList<>();
//        for (XeMay xemay : listxeMay) {
//            if (xemay.getHangSX().equals(hangSX) && xemay.getColor().equals(mau)) {
//                ketQua.add(xemay);
//            }
//        }
//        return ketQua;
//    }
//	public ArrayList<XeTai> timXeTaiTheoHangSXVaMau(String hangSX, String mau) {
//        ArrayList<XeTai> ketQua = new ArrayList<>();
//        for (XeTai xetai : listxeTai) {
//            if (xetai.getHangSX().equals(hangSX) && xetai.getColor().equals(mau)) {
//                ketQua.add(xetai);
//            }
//        }
//        return ketQua;
//    }
	
	
	
	
}
