package day8;

  
class Member {
    String name;
    String account;
    String password;
    int birthYear;
    
    // 생성자
    public Member(String name, String account, String password, int birthYear) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.birthYear = birthYear;
    }
    
    // 정보 추출 메서드
    public String getInfo() {
        return name + "(" + account + "," + password + "," + birthYear + ")";
    }
}

public class MemberTest {
    public static void main(String[] args) {
        // Member 객체 생성
        Member member1 = new Member("홍길동", "hong", "1234", 1980);
        Member member2 = new Member("김철수", "kim", "abcd", 1990);
        Member member3 = new Member("이영희", "lee", "pass", 2000);
        
        // 각 회원의 정보 출력
        System.out.println("회원1 : " + member1.getInfo());
        System.out.println("회원2 : " + member2.getInfo());
        System.out.println("회원3 : " + member3.getInfo());
    }
}


	
	
	
	
	
	
	
	
	
	
	
