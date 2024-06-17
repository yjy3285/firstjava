package day10;

public class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1, 2, 3);
		System.out.println(p3.getLocation());
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point { //오류 난 이유, 부모클래스에서 객체 생성자 사용했기에 자식클래스에서는 super객체생성자 사용해야함.
	int z;
	Point3D(int x, int y, int z) {
		super(x,y);
		//this.x = x;
		//this.y = y;		
		this.z = z;
	}
	String getLocation() { // 오버라이딩(private 오버라이딩만 아니면 다 가능)
		return super.getLocation() + ", z :" + z;//super. 안붙이면 자기 자신 호출하게 됨.(stack overflow 발생)
	}
}
