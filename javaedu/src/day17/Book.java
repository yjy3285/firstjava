package day17;

public class Book {

	String title;
	String author;
	int price;


	// 아규먼트를 받는 생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// 책 정보 추출 메서드
	public String getInfo() {
		return title + (title.length()>10 ? "\t" : "\t\t") + author + (author.length()>6 ? "\t" : "\t\t") + price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

}
