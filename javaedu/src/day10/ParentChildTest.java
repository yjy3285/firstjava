package day10;
class Parent {  
	int x = 1, y = 2;
}
class Child extends Parent {
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			// 	100-> 지역변수 쓰임
		System.out.println(this.x);		//   10 ->지역 말고 멤버변수 x
		System.out.println(super.x);	// 	1-> 부모의 x
		System.out.println(y);			//  2 ->지역,멤버 없으니까 위에 부모부터 찾아간 것
		System.out.println(this.y);		// 2	->조상을 찾아가게 되어있음(부모의 y)
		System.out.println(super.y);	//   2->바로 부모한테 감
		//System.out.println(z);
	}
	public String toString() { //접근제어자 축소시키는 것은 안된다.
		return "Child 클래스의 객체임 ";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {		
//		Child ch = new Child();
//		ch.printInfo();
		//new Child().printInfo();
		Child obj = new Child();
		obj.printInfo();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println("객체정보 : "+ obj);
		
		System.out.println("현재시간 : " + new java.util.Date()); //import 선언 해주거나 생성자명 앞에 패키지 붙어줘야 함.
		
		
		}
}



