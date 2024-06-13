package day8;

class Student //public class에는 하나만 정의가 되어야 함.소스 이름은 이미 studenttest에 맞춰져 있기에.사용하고싶다면 student는 같은 소스안에 있어서는 안된다.
//하나의 자바소스 안에는 얼마든지 class 정의 가능하지만, public은 하나여야만 한다.
{ 
	String name;
	int grade; //int형은 기본값이0
	String subject;
	
	void study() {
		System.out.println(name + "학생은" + subject + "과목을 학습합니다.");
	}
	String getStudentinfo() {
		return name + "학생은" + grade + "학년입니다.";
	}
	
	//string형 (참조형) 기본 값 null= 아직은 참조하는 대상이 정해지지 않았음.
	//객체 만들기 위한 or 일반클래스
}
public class StudentTest {
	public static void main(String[] args) { 
		Student st1 = new Student();
		System.out.println(st1); //day8.Student@~ /@앞에는 참조하게 된 객체가 어떤 클래스 객체냐, @뒤에는 논리적 객체인 참조값 뜸.
		st1.study();
		System.out.println(st1.getStudentinfo());
		st1.name = "둘리";
		st1.grade = 3;
		st1.subject = "javascript";
		
		st1.study();
		System.out.println(st1.getStudentinfo());
		Student st2 = new Student();
		st2.name = "듀크";
		st2.grade = 3;
		st2.subject = "SQL";
		
		st2.study();
		System.out.println(st2.getStudentinfo());
		System.out.println(st2); //생성되는 객체마다 참조값은 달라짐.
		System.out.println("st2 = st1 수행 ----");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1.getStudentinfo());
		System.out.println(st2.getStudentinfo()); //st2가 원래 참조하고 있던 것은 garbage 되고 jvm이 나중에 garbage collector 실행
		
		
		
		
	}

}

