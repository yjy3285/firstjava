package day5;

public class ArrayLab3 {
	public static void main(String[] args) {
		char letters[] = {'J', 'a', 'v', 'a'};
		for (char ch : letters) {
			if (ch >= 'A' && ch <= 'Z')
				System.out.println(Character.toLowerCase(ch));
			else
				System.out.println(Character.toUpperCase(ch));
		}
		

		//대문자 소문자 차이는 32 . 따라서 대문자에서 +32 하면 소문자, 소문자에서 -32하면 대문자.//any[i] = (char)(ary[i]+32)
	}
}


