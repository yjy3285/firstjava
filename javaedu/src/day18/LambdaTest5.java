package day18;

@FunctionalInterface
interface MyFunctionalInterface1 {
	public void method1();
}

public class LambdaTest5 {
	public static void main(String[] args) {
		MyFunctionalInterface1 fi = () -> { //람다식은 실제 클래스 파일은 만들어 지지 않는다. 매개변수 없을 때는 () 꼭 ! ,오버라이딩 할 내용 {} 안에 넣어줌.
			String str = "method call1";
			System.out.println(str);
		};
		fi.method1();

		fi = () -> System.out.println("method call2");		
		fi.method1();
	}
}
