package day13;


import java.util.LinkedList;

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
public class LinkedListLab1 {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<>();
		
		list.add(new Friend("홍길동", "010-8479-5328", "ysy9528@naver.com"));
		list.add(new Friend("김철수", "010-7658-3716", "yjy3285@hufs.ac.kr"));
		list.add(new Friend("이영희", "010-5882-9735", "jullie12@naver.com"));
		list.add(new Friend("황미애", "010-3727-6153", "meeae89@gmail.com"));
		list.add(new Friend("최소망", "010-8403-8812", "mangso01@naver.com"));

		System.out.println("이름    전화번호     메일주소");
		System.out.println("----------------------------");
		
		for(Friend friend : list) {
			System.out.println(friend.getInfo());
		}
	}

}


	


