package day6;
public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(5);
		System.out.println("main() 수행종료");
	}	
	static void printMyName(int num) { //매개변수 숫자 전달시 반드시 int!(boolean,double은 x char은 가능(형변환 가능하기에)
		if (num <= 0)
			return;
		for(int i=1; i <= num; i++)
			System.out.println("유니코");
	}
}
