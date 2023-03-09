package Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
	private Map<String, CustomerType> listCustomer;

	public CustomerManager() {
		listCustomer = new HashMap<>();
	}

	public void addCustomer(String name, CustomerType type) {
		listCustomer.put(name, type);
	}

	public void removeCustomer(String name) {
		listCustomer.remove(name);
	}

	public void displayCustomer() {
		System.out.println("-------------------");
		System.out.println("Customer List: ");
		int i = 1;
		for (String name : listCustomer.keySet()) {
			CustomerType type = listCustomer.get(name);
			System.out.println( i + ": " + name + " - Hạng: " + type);
			i++;
		}
	}
}
