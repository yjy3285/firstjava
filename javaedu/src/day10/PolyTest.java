package day10;

public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo("ABC");
		printObjectInfo("가나다");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/Temp"));
		printObjectInfo(new day9.Card());
		printObjectInfo(new int[10]); // int 타입이면 [I
		printObjectInfo(new double[] { 10.5, 3.14 }); // double형이면 [D 등 객체전달 가능/조상,자손의 객체도 참조가능
		printObjectInfo(100); //Java 5 Auto Boxing 구문
		printObjectInfo('가');
		printObjectInfo(true);

	}

	static void printObjectInfo(Object o) {
		if (o instanceof String) { // 어떤 객체든 object의 역할 할 수 있는 것(instanceof 사용 시 조상꺼까지//내용이 나오는 건 본인에 맞게
			// to string 오버라이딩 한 것
			System.out.println("문자열 객체가 전달됨 : " + o.toString() + "(" + ((String) o).length() + ")"); // 자손형으로 강제 형변환
			// 자형 리터럴이 스트링 객체
		} else {
			System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName()); // 스트링 객체 아닌건 다 else로
		}

	} // 패키지명까지 나오는게 기본

}