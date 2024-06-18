package day11;

abstract class Shape {
	String color;

	abstract void draw(); //abstract 메소드로 정의 ->shape 사용하면 반드시 오버라이딩 해야함. 뒤에 블럭있어서는 안되고 ;로 끝나야 함.

	void setColor(String color) {
		this.color = color;
	}
}

class Circle2 extends Shape {
	void draw() {
		System.out.println(color + " 원을 그리는 기능");
	}
}

class Rectangle2 extends Shape {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle2 extends Shape {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class AbstractTest2 {
	public static void main(String args[]) {
		Shape s = new Circle2();
		s.setColor("파란색");
		printInfo(s);
		s = new Rectangle2();
		s.setColor("분홍색");
		printInfo(s);
		s = new Triangle2();
		s.setColor("연두색");
		printInfo(s);
	}

	static void printInfo(Shape obj) {
		obj.draw();
	}
}
