package Test;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Test {
	public static void main(String[] args) {
	
		Customer cu = new Customer();
		new Thread(new Runnable() {
			@Override
			public void run() {
				cu.money(15000);
				
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				cu.deposit(100000);
			}
		}).start();
	}
}
