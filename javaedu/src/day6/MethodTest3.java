package day6;
public class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(1, '#');
		System.out.println("--------------");
		printMyName(3, '*');
		System.out.println("--------------");
		printMyName(2, '@');
		System.out.println("--------------");
		printMyName((int)3.14, '%'); //3.14는 더블형이라 전달 못함 .작은->큰으로 전달 char<int<long<float<double(boolean은 제외)
		System.out.println("main() 수행종료");
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i <= num; i++)
			System.out.println(deco+"유니코"+deco);
	}
}
