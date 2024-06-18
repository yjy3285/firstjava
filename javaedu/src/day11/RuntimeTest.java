package day11;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
		r.exec("c:/windows/notepad.exe");
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();

		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3); // runtime 클래스 객체는 한번만 만들어지기에 참조값이 똑같은 것을 확인할 수 있음.=>singleton 패턴

	}

}
