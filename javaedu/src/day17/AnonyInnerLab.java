package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;





public class AnonyInnerLab //implements Comparator<Book>
{
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		
		list.add(new Book("이것이 자바다", "신용권,임경균", 38000));
		list.add(new Book("오라클 SQL과 PL/SQL", "서진수,김균도", 32000));
		list.add(new Book("자바스크립트", "Mana", 27000));
		list.add(new Book("Doit! 자바프로그래밍", "박은중", 22500));
		list.add(new Book("실전 스프링 부트", "솜나트", 36000));
		
		
		System.out.println("[소팅 전]");
		for(Book books : list) {
			System.out.println(books.getInfo());
		}
		
		Collections.sort(list, new Comparator<Book>(){
			@Override
			public int compare(Book o1, Book o2) {
				if(o1.price<o2.price) return -1;
				
				else if(o1.price == o2.price) return 0;
				
				else return 1;
			}
		});	
		System.out.println();
		System.out.println("[소팅 후]");
		for(Book books : list) {
			System.out.println(books.getInfo());
		}
		
		


}
}
