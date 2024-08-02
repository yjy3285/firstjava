package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckEmpLab {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
        String user = "SCOTT"; 
        String password = "TIGER"; 
        Scanner scanner = new Scanner(System.in);

        try {
            
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            while (true) {
                System.out.print("검색하려는 직원의 이름을 입력하세요: ");
                String searchName = scanner.nextLine().trim();

                
                String sql = "SELECT ename, hiredate, deptno FROM emp WHERE LOWER(ename) = LOWER('" + searchName + "')";
                rs = stmt.executeQuery(sql);

                if (rs.next()) {
                    String ename = rs.getString("ename");
                    java.sql.Date hiredate = rs.getDate("hiredate");
                    int deptno = rs.getInt("deptno");
                    System.out.printf("%s 직원은 근무중입니다.%n", ename);
                    System.out.printf("%tY년 %<tm월에 입사했고 현재 %d 번부서에서 근무하고 있습니다.%n", hiredate, deptno);
                } else {
                    System.out.printf("%s 직원은 근무하지 않습니다.%n", searchName);
                }

                System.out.print("계속 검토하려고 하십니까? (yes/no): ");
                String response = scanner.nextLine().trim().toLowerCase();
                if (!response.equals("yes")) {
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

