package jdbcexam;

import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SelectBookLab {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "SCOTT"; 
    private static final String DB_PASSWORD = "TIGER"; 

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 모두 출력하기");
            System.out.println("2. 가격이 높은 순으로 출력하기");
            System.out.println("3. 20000 이상의 도서들만 출력하기");
            System.out.println("4. 웹 프로그래밍 도서들만 출력하기");
            System.out.println("5. 데이터베이스와 인프라 도서들만 출력하기");
            System.out.println("6. 도서명에 '자바'를 포함하는 도서들만 출력하기");
            System.out.println("7. 분류별 도서 가격의 평균을 출력하기");
            System.out.print("원하는 메뉴의 번호를 선택 : ");
            
            int menuChoice = Integer.parseInt(scanner.nextLine());
            
            switch (menuChoice) {
                case 1:
                    printAllBooks();
                    break;
                case 2:
                    printBooksByPriceDesc();
                    break;
                case 3:
                    printBooksAbove20000();
                    break;
                case 4:
                    printWebProgrammingBooks();
                    break;
                case 5:
                    printDBAndInfraBooks();
                    break;
                case 6:
                    printBooksContainingJava();
                    break;
                case 7:
                    printAveragePriceByClass();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    break;
            }
            
            System.out.print("계속 처리하겠습니까?(y/n): ");
            String continueMenu = scanner.nextLine();
            if (!continueMenu.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    private static void printAllBooks() {
        String query = "SELECT * FROM book";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
        	System.out.printf("%-5s %-30s %-10s %-10s\n", "ID", "Title", "Price", "Class");
            while (rs.next()) {
            	System.out.printf("%-5d %-30s %-10s %-10s\n", rs.getInt("id"), rs.getString("title"),
                        formatPrice(rs.getInt("price")), rs.getString("class"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printBooksByPriceDesc() {
        String query = "SELECT * FROM book ORDER BY price DESC";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
        	System.out.printf("%-5s %-30s %-10s %-10s\n", "ID", "Title", "Price", "Class");
            while (rs.next()) {
                System.out.printf("%-5d %-30s %-10s %-10s\n", rs.getInt("id"), rs.getString("title"),
                        formatPrice(rs.getInt("price")), rs.getString("class"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printBooksAbove20000() {
        String query = "SELECT title, price FROM book WHERE price >= 20000";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
        	System.out.printf("%-30s %-10s\n", "Title", "Price");
            while (rs.next()) {
                System.out.printf("%-30s %-10s\n", rs.getString("title"), formatPrice(rs.getInt("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printWebProgrammingBooks() {
        String query = "SELECT title, price FROM book WHERE class = 'b02'";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
        	System.out.printf("%-30s %-10s\n", "Title", "Price");
            while (rs.next()) {
                System.out.printf("%-30s %-10s\n", rs.getString("title"), formatPrice(rs.getInt("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printDBAndInfraBooks() {
        String query = "SELECT title, price FROM book WHERE class IN ('b04', 'b05')";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
        	System.out.printf("%-30s %-10s\n", "Title", "Price");
            while (rs.next()) {
                System.out.printf("%-30s %-10s\n", rs.getString("title"), formatPrice(rs.getInt("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printBooksContainingJava() {
        String query = "SELECT title, price FROM book WHERE title LIKE '%자바%'";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
        	System.out.printf("%-30s %-10s\n", "Title", "Price");
            while (rs.next()) {
                System.out.printf("%-30s %-10s\n", rs.getString("title"), formatPrice(rs.getInt("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printAveragePriceByClass() {
        String query = "SELECT bc.class_title, AVG(b.price) AS avg_price FROM book b " +
                       "JOIN book_class bc ON b.class = bc.id GROUP BY bc.class_title";
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                System.out.printf("%s 도서들의 가격 평균은 %s입니다.\n",
                        rs.getString("class_title"), formatPrice(rs.getInt("avg_price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static String formatPrice(int price) {
        NumberFormat formatter = NumberFormat.getInstance(Locale.KOREA);
        return formatter.format(price);
    }
   
}
