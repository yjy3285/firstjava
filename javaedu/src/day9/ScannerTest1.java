package day9;

import java.util.Scanner;
public class ScannerTest1 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		String a,b,c,d;
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next(); //단어와 단어사이 공백으로 인식해서 다음 칸으로 넘어가게 된다. //워드 구분은 공백 뿐 아니라 enter문자도 받는다. 그래서 5개 입력하고 싶어도 4개만 설정(next 4개)해놨기에 4개까지만 입력받음.
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	
		sc.close(); //시스템 더이상 사용하지 않겠다는 의미로 close 필수 (설정안하면 warning이라고 뜸.)
	}
}
