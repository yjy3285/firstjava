package mvclab;
import java.util.Scanner;


import mvclab.controller.StudentController;

public class StudentMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("******************************************************");
			System.out.println("처리하려는 기능을 선택하세요.");
			System.out.println("1. 학생 정보 출력");
			System.out.println("2. 학생 정보 입력");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 점수 확인");
			System.out.println("6. 종료");
			System.out.println("입력 : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			if (num == 1)
				new StudentController().printAll();
			else if (num ==2) {
				System.out.print("학생 정보를 입력하세요 : ");
				String name = scan.nextLine();
				int score = scan.nextInt();
				new StudentController().insert(name, score);
				
			}else if(num==3) {
				System.out.print("삭제하려는 학생의 이름을 입력하세요 : ");
				String name = scan.nextLine();
				new StudentController().delete(name);
			}else if(num==4) {
				
			
				System.out.print("점수를 수정하려는 학생의 이름을 입력하세요 : ");
				String name = scan.nextLine();
				System.out.print("수정하려는 학생 점수를 입력하세요 : ");
                int score = scan.nextInt();
				new StudentController().update(score,name);
                
				
			}else if(num==5) {
				
				System.out.println("점수를 확인하려는 학생의 이름을 입력하세요 : ");
				String name = scan.nextLine();
				new StudentController().printScore(name);
			}else {
				System.out.println("***************************");
				System.out.println("* 종료하겠습니다. *");
				System.out.println("***************************");
				break;
			}
			
			
		}
		scan.close();
	}
}

