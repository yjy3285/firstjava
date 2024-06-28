package day18;

//@FunctionalInterface 
interface Test { //함수형 인터페이스 자격 x , abstract 하나만 있어야 함. ->람다식 구현 x
	void run();

	void print();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		Test test = new Test() {
			@Override
			public void run() {
				System.out.println("run");
			}

			@Override
			public void print() {
				System.out.println("print"); //anonymous inner local class 만든 것
			}
		};
		test.run();
		test.print();
	}
}
