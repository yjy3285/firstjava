package mvc.view;

import java.util.Scanner;
import mvc.controller.MeetingController;


public class MeetingApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MeetingController con = new MeetingController();
		while (true) {
			con.meetingRead();
			System.out.println("-------------------------------------------------");
			System.out.println("처리하고자 하는 작업에 대한 넘버를 입력하세요(^^)");
			System.out.println("1. 미팅글 작성");
			System.out.println("2. 미팅글 삭제");
			System.out.println("3. 이름으로 검색");
			System.out.println("4. 댓글 작성");
			System.out.println("5. 댓글 읽기");
			System.out.println("6. 종료");
			System.out.print("입력 : ");			
			int num = scan.nextInt();
			scan.nextLine();
			if (num == 1) {
				System.out.print("미팅할 친구 이름 : ");
				String name = scan.nextLine();
				System.out.print("미팅 목적 : ");
				String title = scan.nextLine();
				System.out.print("미팅 일시(yyyy/mm/dd/hh24/mi) : ");
				String stringmdate = scan.nextLine();
				con.meetingCreate(name, title, stringmdate);
			} else if (num == 2) {
				System.out.print("삭제하려는 미팅글의 번호를 입력하세요 : ");
				int id = Integer.parseInt(scan.nextLine());
				con.meetingDelete(id);
			}  else if (num == 3) {
				System.out.print("검색하려는 이름을 입력하세요 : ");
				String name = scan.nextLine();
				con.meetingRWithName(name);
			}  else if (num == 4) {
				System.out.print("댓글 작성할 미팅글 번호 : ");
				int refid = Integer.parseInt(scan.nextLine());
				System.out.print("댓글 작성자 이름 : ");
				String name = scan.nextLine();
				System.out.print("댓글 내용 : ");
				String content = scan.nextLine();
				con.replyCreate(refid, name, content);
			} else if (num == 5) {
				System.out.print("읽고자 하는 댓글의 미팅글 번호 : ");
				int refid = Integer.parseInt(scan.nextLine());
				con.replyRead(refid);
			} else {			
				break;
			}	
			System.out.println("------------------------------------------- ");
		}
		scan.close();	
		System.out.println("----------------------종료----------------------- ");
	}
}
