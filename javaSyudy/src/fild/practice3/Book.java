package fild.practice3;

public class Book {
	
	//필드
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//생성자
	public Book() {
		this("미입력", "미정", "미입력",0,0);
	}
	
	public Book(String title, String publisher,String author) {
//		this.title=title;
//		this.publisher = publisher;
//		this.author = author;
		this(title,publisher,author,0,0);
	}
	
	public Book(String title,String publisher,String author, int price, double discountRate) {
		this.title=title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void inform() {
		System.out.print("제목: " + this.title + "\n출처 : " + this.publisher + "\n저자 : " + this.author + "\n가격 :" + this.price + "\n할인율 : "+ this.discountRate);
	}

}