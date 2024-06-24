package collection;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> products = new HashSet<>();

		addProduct(products, new Product("p100", "TV", "20000"));
        addProduct(products, new Product("p200", "Computer", "10000"));
        addProduct(products, new Product("p100", "MP3", "700"));
        addProduct(products, new Product("p300", "Audio", "1000"));
		

		System.out.println("제품ID    제품명    가격");
		System.out.println("----------------------------");
		
		for (Product product : products) {
            System.out.println(product);
        }
		
	}

	private static void addProduct(HashSet<Product> products, Product product) {
		// TODO Auto-generated method stub
		if (products.add(product)) {
            System.out.println("성공적으로 저장되었습니다.");
        } else {
            System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
        }
		System.out.println();
	}

}
