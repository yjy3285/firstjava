package day10;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		return super.getInfo() + " " + phoneNum + " " + email;

	}
}

public class FriendTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Friend friend1 = new Friend("홍길동", "010-8479-5328", "ysy9528@naver.com");
		Friend friend2 = new Friend("김철수", "010-7658-3716", "yjy3285@hufs.ac.kr");
		Friend friend3 = new Friend("이영희", "010-5882-9735", "jullie12@naver.com");
		Friend friend4 = new Friend("황미애", "010-3727-6153", "meeae89@gmail.com");
		Friend friend5 = new Friend("최소망", "010-8403-8812", "mangso01@naver.com");

		System.out.println("이름    전화번호     메일주소");
		System.out.println("----------------------------");
		System.out.println(friend1.getInfo());
		System.out.println(friend2.getInfo());
		System.out.println(friend3.getInfo());
		System.out.println(friend4.getInfo());
		System.out.println(friend5.getInfo());
	}

}
