package Test_FinalVarriable;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		
		DecimalFormat d = new DecimalFormat("#.00");
		final double pi = 3.14;
		final double r = 5;
		System.out.println("Diện tích hình tròn " + d.format(pi*r));
	} 


	
}
