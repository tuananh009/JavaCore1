package Test;

import java.util.Base64;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	String name = "Nguyen Tuan Anh";
	String adress = "Ninh Bình";
	String url = "https://ops.nccsoft.vn/DefaultCollection/ncc-training-java/_wiki/wikis/ncc-training-java.wiki/2360/9.-Java-Collection-Algorithm";
	System.out.print("String to Encode: \t");
	String encodeName = Base64.getEncoder().encodeToString(name.getBytes());
	String encodeAdress = Base64.getEncoder().encodeToString(adress.getBytes());
	String encodeUrl = Base64.getEncoder().encodeToString(url.getBytes());
	System.out.println(encodeName + " " +  encodeAdress + " \n" + encodeUrl);
	
	System.out.print("Encode to String: \t");
	byte[] decodeBytes = Base64.getDecoder().decode(encodeName);
	String name2 = new String(decodeBytes);
	byte[] decodeBytes2 = Base64.getDecoder().decode(encodeAdress);
	String adress2 = new String(decodeBytes2);
	byte[] decodeBytes3 = Base64.getDecoder().decode(encodeUrl);
	String url3 = new String(decodeBytes3);
	System.out.println(name2 + " - " + adress2 + "\n" +url3);
}
}
