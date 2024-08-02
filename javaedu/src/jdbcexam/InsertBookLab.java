package jdbcexam;

import java.sql.*;
import java.util.Scanner;

public class InsertBookLab {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "SCOTT"; 
    private static final String DB_PASSWORD = "TIGER"; 

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int count = 0;

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO book (id, title, price, class) VALUES (book_seq.nextval, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            while (true) {
                System.out.print("도서명을 입력하세요: ");
                String title = scanner.nextLine();

                System.out.print("가격을 입력하세요: ");
                int price = 0;
                while (true) {
                    try {
                        price = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("잘못된 입력입니다. 가격을 다시 입력하세요: ");
                    }
                }

                System.out.println("도서분류에 대한 넘버를 입력하세요.");
                System.out.println("    1. 프로그래밍 언어");
                System.out.println("    2. 웹 프로그래밍");
                System.out.println("    3. 빅데이터");
                System.out.println("    4. 데이터베이스");
                System.out.println("    5. 인프라");
                System.out.print("선택(1~5): ");
                int classChoice = 0;
                while (true) {
                    try {
                        classChoice = Integer.parseInt(scanner.nextLine());
                        if (classChoice < 1 || classChoice > 5) {
                            throw new NumberFormatException();
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("잘못된 선택입니다. 다시 입력해주세요 (1~5): ");
                    }
                }

                String bookClass = "";
                switch (classChoice) {
                    case 1:
                        bookClass = "b01";
                        break;
                    case 2:
                        bookClass = "b02";
                        break;
                    case 3:
                        bookClass = "b03";
                        break;
                    case 4:
                        bookClass = "b04";
                        break;
                    case 5:
                        bookClass = "b05";
                        break;
                }

                pstmt.setString(1, title);
                pstmt.setInt(2, price);
                pstmt.setString(3, bookClass);
                pstmt.executeUpdate();

                System.out.println("정보가 입력되었습니다.");
                count++;

                System.out.print("계속 입력하겠습니까?(y/n): ");
                String continueInput = scanner.nextLine();
                if (!continueInput.equalsIgnoreCase("y")) {
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(count + "개의 데이터 입력 완료!");
    }
}
