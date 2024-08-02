package test240711.object3;

public class Book {
	
	private String title;
	private String genre;
	private String author;
	private int num;
	
	//생성자
	public Book() { }

	public Book(String title, String genre, String author, int num) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.num = num;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String toString () {
		return "제목 : " + this.title +"장르 : " + this.genre + "저자 : " +this.author + "책번호 : " + this.num;
	}
}
