package day18;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}
public class EnumTest1 {
	public static void main(String args[]) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		Season data1 = Season.FALL;
		if (data1 == Season.FALL)
			System.out.println("당신이 좋아하는 계절은 가을!!");

		switch (data1) {
		case SPRING:
			System.out.println("대저토마토");
			break;
		case SUMMER:
			System.out.println("복숭아");
			break;
		case FALL:
			System.out.println("홍로");
			break;
		case WINTER:
			System.out.println("레드향");
		}

		for (Season v : Season.values()) //values : 상수들을 배열에 담아서 리턴
			System.out.print(v + " ");
		System.out.println(); //상수명이 name으로 출력
		
		Season data2 = Season.valueOf("SUMMER"); //summer라는 상수가 리턴 된다.
		System.out.println(data2); //상수이면서 문자열형태의 이름이 된다.
	}
}
