package Test;

public enum Drink {
	COFFEE("Coffee", 25000,Size.SMALL),
	LATTE("Latte",35000,Size.MEDIUM),
	MATCHA("Matcha",45000,Size.LARGE),
	MILK_TEA("Milk Tea",55000,Size.MEDIUM),
	TEA("Tea",20000,Size.SMALL),
	ICED_TEA("Iced tea",10000,Size.MEDIUM);
	
	
	private final String name;
	private final double price;
	private final Size size;
	
	private Drink(String name, double price, Size size) {
		this.name = name;
		this.price = price;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public Size getSize() {
		return size;
	}
	
	
	
	
}	
