package day3;

public class AlphaTest {
	public static void main(String[] args) {
		int num = (int)(Math.random()*26) + 1;
	
	char ch = (char)('A' + num - 1);
	System.out.println("추출된 숫자 : "+num);
	System.out.println(ch);
	}

}

