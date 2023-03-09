package Bai10;

import java.util.Iterator;
import java.util.Scanner;

public class VanBan {
	private String chuoiVB;

	public VanBan(String chuoiVB) {
		super();
		this.chuoiVB = chuoiVB;
	}

	public VanBan() {
		super();
	}
	
	public int count(String input) {
//		char space = ' ';
//		char tab = '\t';
//		char line = '\n';
//		int count =0 ;
//		int size = input.length();
//		for (int i = 0; i < size; i++) {
//			if (input.charAt(i)!= space || input.charAt(i)!= tab || input.charAt(i)!=line) {
//				count ++;
//			}
//		}
//		return count;
		if (input  == null || input.isEmpty()) {
			return 0;
		}
		String[] count = input.trim().split("\\s+");
		return count.length;
	}
	
	public int countA(String input) {
		int count = 0;
		int size = input.length();
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) == 'a' || input.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
	
	public String chuanhoa(String input) {
	      if (input == null || input.isEmpty()) {
	            return "";
	        }
	        String str = input.trim().replaceAll("\\s+", " ");
	        return str;
	    }

	}
	
