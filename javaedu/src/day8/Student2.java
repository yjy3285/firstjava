package day8;



public class Student2 implements java.io.Serializable {
	
		String name;
		int grade; //int형은 기본값이0
		String subject;
		
		Student2() {
			this("둘리", 3, "JavaScript");
			
		}
		public Student2(String name, int grade, String subject) {
			this.name = name;
			this.grade = grade;
			this.subject = subject;
			
		}
		
		void study() {
			System.out.println(name + "학생은" + subject + "과목을 학습합니다.");
		}
		public String getStudentInfo() {
			return name + "학생은" + grade + "학년입니다.";
		}
		
	 public class StudentTest2 {
		public static void main(String[] args) { 
			Student2 st1 = new Student2(); 
			System.out.println(st1); 
			st1.study();
			System.out.println(st1.getStudentInfo());
			
			Student2 st2 = new Student2("듀크", 3, "SQL"); 
			
			
			st2.study();
			System.out.println(st2.getStudentInfo());
			System.out.println(st2); //생성되는 객체마다 참조값은 달라짐.
			System.out.println("st2 = st1 수행 ----");
			st2 = st1;
			System.out.println(st1);
			System.out.println(st2);
			System.out.println(st1.getStudentInfo());
			System.out.println(st2.getStudentInfo()); //st2가 원래 참조하고 있던 것은 garbage 되고 jvm이 나중에 garbage collector 실행
			
			
			
		}
		
	 }
	 
	}
			
			
