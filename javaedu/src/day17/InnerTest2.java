package day17;

class LocalTest {
	String name = "Java";

	void pr(final String s) {
		final int su = 100; //final 형 지역변수는 사용가능
		System.out.println(s + " : " + su);
		class Local {
			void pr(String ls) {
				System.out.println("s : " + s);
				System.out.println("ls : " + ls);				
				System.out.println(name);
				System.out.println(su);
			}
		}
		Local lt = new Local();
		lt.pr("Local Test");
	}
}

public class InnerTest2 {
	public static void main(String args[]) {
		LocalTest l = new LocalTest();
		l.pr("Main Call");
	}
}
