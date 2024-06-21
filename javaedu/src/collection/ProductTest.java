package collection;

import java.util.HashSet;



public class ProductTest {

	public static void main(String[] args) {

		Product pr1 = new Product("p100 ", "TV", "20000");
		Product pr2 = new Product("p200 ", "Computer", "10000");
		Product pr3 = new Product("p100 ", "MP3", "700");
		Product pr4 = new Product("p300 ", "Audio", "1000");
		HashSet<Product> product = new HashSet<>();
		
		//for(Product product : pro)

		if (product.add(pr1)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다.");

		}

		if (product.add(pr2)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다.");
		}

		if (product.add(pr3)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다.");
		}

		if (product.add(pr4)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다.");
		}

		System.out.println("제품ID    제품명    가격");
		System.out.println("----------------------------");

		for (Product pro : product) {
			System.out.println(pro.getInfo());
		}

	}

}