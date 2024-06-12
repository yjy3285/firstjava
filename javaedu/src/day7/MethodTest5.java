package day7;
public class MethodTest5 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		int result = operate(10,20);
		System.out.println("호출 결과1 : "+result);
		System.out.println("호출 결과2 : "+operate(100,200));
		int result2 = operate(11,22) % 2;
		if(result2 == 0)
			System.out.println("호출 결과3 짝수");
		else
			System.out.println("호출 결과3 홀수");
		System.out.println("호출 결과4 : "+operate(100,200,300));
		System.out.println(getName());
		System.out.println("*" + getName() + "*");
		System.out.println("main() 수행종료");		
	}	
	static int operate(int num1, int num2) {
		//int result=0;// 메서드 오버로딩
		//if(num1>0 && num2>0) //에러나는 이유:리턴값이 if문 안에 있어서...?  A>이 조건문이 거짓일 때 무엇을 리턴할지 알 수가 없음. 예를들어 둘다 양수가 나오면 작동이 멈춘다거나..그런경우 있었기에 컴파일러가 체크하는 것!
	    return num1+num2;  //리턴값 int형
		//return result; //음수값일 경우 0을 리턴한다. 이 리턴값은 if문과는 상관없이 무조건 수행하는 것이기에. 최소화하는것이 가독성이 좋지만 꼭 하나여야만 하는 것은 x. 
	}
	static int operate(int num1, int num2, int num3) {
		return num1+num2+num3; //아규먼트 3개주면 호출됨 // 만약 아규먼트 안주면 컴파일 오류뜸.
	}
	static String getName() {
		return "김정현";
	}
}







