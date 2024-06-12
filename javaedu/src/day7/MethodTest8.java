package day7;
public class MethodTest8 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		char[] returnValue = getName(true);
		System.out.println(returnValue);
		System.out.println(getName(!true)); //! ->논리 부정 연산자
		System.out.println("main() 수행종료");
	}
	static char[] getName(boolean type) { //true or false 전달
		char ary[];
		if(type) //ture가 전달 될 경우
			ary = new char[] {'J', 'A', 'V', 'A'};
		else  //false가 전달 될 경우
			ary = new char[] {'P', 'Y', 'T', 'H', 'O', 'N'};
		return ary;
	}
}
