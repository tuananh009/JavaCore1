package Test2;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float avarageRate;
	private int[] RateList = new int[3];

	
	
	public News(int id, String title, String publishDate, String author, String content, float avarageRate,
			int[] rateList) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.avarageRate = avarageRate;
		RateList = rateList;
	}

	public News() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAvarageRate() {
		return avarageRate;
	}

	public int[] getRateList() {
		return RateList;
	}

	public void setRateList(int[] rateList) {
		RateList = rateList;
	}

	@Override
	public void Display() {
		System.out.println("Title: " + this.title);
		System.out.println("Publish Date: " + this.publishDate);
		System.out.println("Author: " + this.author);
		System.out.println("Content: " + this.content);
		System.out.println("Average Rate: " + this.avarageRate);

	}
	
	public void Caculate() {
		int sum=0;
		for (int i = 0; i < RateList.length; i++) {
			sum += RateList[i];
		}
		avarageRate = sum /RateList.length;
	}

}
