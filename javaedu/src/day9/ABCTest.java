package day9;

class A{
	A() {
		 //모든 생성자 메서드안에는 super메서드 넣어줌.(안 넣어도 알아서 자동생성(컴파일 할때) 되어있던 것) 그러나 this 호출하는 경우엔 안 넣어줌. 
		System.out.println("A 클래스의 객체 초기화~~");
	}
}
class B extends A{
	B(int num) {
		
		System.out.println("B 클래스의 객체 초기화~~");
	}
}
class C extends B{
	C() {
		super(10);//이런경우 직접 호출해야 함.(자식을 조상에 맞춰야 함.)
		System.out.println("C 클래스의 객체 초기화~~");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		new C(); //c클래스 객체생성하고 호출해줘라는 의미

	}

}//생성자 메서드 안에서 사용가능한 메서드 this,super. 따라서 this 호출 없으면 반드시 super 있어야 함.부모로 지정하고 싶은 클래스가 매개변수  안갖고 있으면 super호출 필수!(맨 위에)
//자동으로넣어주는 경우 아규먼트 없는 애
