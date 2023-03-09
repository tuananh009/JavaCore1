package Test;

import java.util.ArrayList;
import java.util.List;

public class DrinkManager {
	public static void main(String[] args) {
		List<Drink> listDi = new ArrayList<>();
		listDi.add(Drink.COFFEE);
		listDi.add(Drink.LATTE);
		listDi.add(Drink.MATCHA);
		listDi.add(Drink.MILK_TEA);
		listDi.add(Drink.TEA);
		listDi.add(Drink.ICED_TEA);
		System.out.println("---------------------------");
		for (Drink d: listDi) {
			System.out.println(d.getName() + " - "+d.getPrice()+" - " +d.getSize());
			System.out.println("---------------------------");
		}
	}
}
