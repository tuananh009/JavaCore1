package Test3;

public class Book implements iBooks{
	private static int count = 0;
	private int id;
	private String name;
	private String publishDate;
	private String author;
	private String language;
	private float averagePrice;
	private int[] PriceList = new int[5];
	


	public Book() {
		super();
	}

	
	public Book(int id, String name, String publishDate, String author, String language, float averagePrice,
			int[] priceList) {
		super();
		this.id = ++count;
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
		this.language = language;
		this.averagePrice = averagePrice;
		PriceList = priceList;
	}


	public Book(String name, String publishDate, String author, String language, float averagePrice, int[] priceList) {
		super();
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
		this.language = language;
		this.averagePrice = averagePrice;
		PriceList = priceList;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public float getAveragePrice() {
		return averagePrice;
	}


	public int[] getPriceList() {
		return PriceList;
	}


	public void setPriceList(int[] priceList) {
		PriceList = priceList;
	}


	@Override
	public void Display() {
		System.out.println("Name Book: "+this.name);
		System.out.println("Puslish Date: "+ this.publishDate);
		System.out.println("Author: " + this.author);
		System.out.println("Language: "+ this.language);
		System.out.println("Average Price: "+ this.averagePrice);	
	}
	
	public void Calculate() {
		int sum= 0;
		for (int i = 0; i < PriceList.length; i++) {
			sum += PriceList[i];
		}
		averagePrice = sum/PriceList.length;
	}

}
