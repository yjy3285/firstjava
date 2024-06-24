package collection;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;

public class ProductTest2 {
	public static void main(String[] args) {
		LinkedList<Product2> products = new LinkedList<>();

		products.add(new Product2("p100", "TV", "20000"));
		products.add(new Product2("p200", "Computer", "10000"));
		products.add(new Product2("p100", "MP3", "700"));
		products.add(new Product2("p300", "Audio", "1000"));
		
		Collections.sort(products);
		

		System.out.println("제품ID    제품명    가격");
		System.out.println("----------------------------");
		
		for(Product2 product : products) {
			System.out.println(product.toString());
		}
		
		
		
		LocalDate targetDate = LocalDate.of(2001, 7, 16);
		
		
		System.out.printf("%s는 "+ targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN) + "에 태어났어요~~","포뇨");
	}

	


}
