package day14;

import java.util.Scanner;

public class EqualsTest1 {
	public static void main(String[] args) {
		String s1 = "가나다"; //s1,s2는 하나의 객체 공유
		String s2 = "가나다";
		String s3 = new String("가나다"); //가나다라는 내용으로 초기화된 각각의 스트링 객체 참조하는 것.
		String s4 = new String("가나다");

		System.out.println(s1 == s2); //true
		System.out.println(s3 == s4); //false(내용은 같아도 각각의 객체를 참조하고 있기 때문)
		System.out.println(s3.equals(s4)); //문자열 비교할 때
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String inputStr = scan.next();
		if(inputStr.equals(s1)) 
			System.out.println("\"가나다\"를 입력했군요...");
		else 
			System.out.println("\"가나다\"가 아니군요...");
		scan.close();
	}
}
