package day8;

import java.text.NumberFormat;

class Product {
    private String name;
    private int balance;
    private int price;

    // 파라미터를 받는 생성자
    public Product(String name, int balance, int price) {
        this.name = name;
        this.balance = balance;
        this.price = price;
    }

    // 아규먼트를 받지 않는 생성자
    public Product() {
        this.name = "듀크인형";
        this.balance = 5;
        this.price = 10000;
    }

    // 상품명을 리턴하는 메서드
    public String getName() {
        return name;
    }

    // 재고량을 리턴하는 메서드
    public int getBalance() {
        return balance;
    }

    // 가격을 리턴하는 메서드
    public int getPrice() {
        return price;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        // Product 타입의 배열 생성
        Product[] products = new Product[5];

        // Product 객체 생성 후 배열에 대입
        products[0] = new Product();
        products[1] = new Product("자바책", 3, 25000);
        products[2] = new Product("노트북", 2, 1500000);
        products[3] = new Product("스마트폰", 10, 800000);
        products[4] = new Product("헤드폰", 7, 200000);

        // 각 Product 객체의 정보 출력
        for (Product product : products) {
            //String formattedPrice = NumberFormat.getInstance().format(product.getPrice());
            System.out.printf(product.getName() + " " + product.getBalance() + " " + "%,d원\n",product.getPrice());
        }
    }
}

