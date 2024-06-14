package day9;

import java.util.Scanner;
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		String a,b,c,d;
		a = sc.nextLine(); //next는 워드를 읽는다면 nextline은 하나의 행을 읽는 것.(개행문자(enter문자) 인식될때까지 하나의 행으로 인식함)
		b = sc.nextLine();
		c = sc.nextLine();
		d = sc.nextLine(); //next,nextline은 타입이 string형
		System.out.println("a = [" + a + "]");
		System.out.println("b = [" + b+ "]");
		System.out.println("c = [" + c+ "]");
		System.out.println("d = [" + d+ "]");	//숫자 입력했어도 string형으로 리턴
		sc.close();
	}
}
