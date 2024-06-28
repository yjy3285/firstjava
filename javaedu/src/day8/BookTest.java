package day8;

class Book {
    String title;
    String author;
    int price;

    // 아규먼트를 받지 않는 생성자
    public Book() {
        this.title = "이것이 자바다";
        this.author = "신용권";
        this.price = 36000;
    }

    // 아규먼트를 받는 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 책 정보 추출 메서드
    public String getInfo() {
        return title + " " + author + " " + price + "원";
    }
}

public class BookTest {
    public static void main(String[] args) {
        // Book 객체 생성
        Book book1 = new Book();
        Book book2 = new Book("불편한 편의점", "김호연", 14000);  //각각 변수에 담았기에 반복문 사용불가
        Book book3 = new Book("점프 투 파이썬", "박응용", 22000);
        Book book4 = new Book("달러구트 꿈 백화점", "이미예", 13800);
        Book book5 = new Book("5일의 기적 당독소 다이어트", "박명규", 10000);
        
        // 각 책의 정보 출력
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println(book4.getInfo());
        System.out.println(book5.getInfo());
    }
}
