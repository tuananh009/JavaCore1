package Test;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Customer {
	int amount = 1000;
	Locale l = new Locale("vi", "VN");
	Currency c = Currency.getInstance(l);
	NumberFormat n = NumberFormat.getCurrencyInstance(l);
	synchronized void money(int amount) {
		
		System.out.println("Rút tiền");
		if (this.amount < amount) {
			System.out.println("Số tiền rút: " + n.format(amount) +" Tài khoản không đủ tiền, đợi nộp....");
			try {
				wait();
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
		System.out.println("Hoàn thành rút tiền");
		this.amount -= amount;
		System.out.println("Số tiền còn lại: " + n.format(this.amount));
	}
	
	synchronized void deposit(int amount) {
		
		System.out.println("Gửi tiền ... ");
		this.amount +=amount;
		System.out.println("Số tiền đã gửi "+ n.format(amount));
		System.out.println("Hoàn thành gửi tiền");
		notify();
	}
	
	
}
