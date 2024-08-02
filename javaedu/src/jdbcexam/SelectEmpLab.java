package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Random;

public class SelectEmpLab {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
        String user = "SCOTT"; 
        String password = "TIGER"; 

        try {
            
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            
            Random random = new Random();
            boolean randomValue = random.nextBoolean();

            if (randomValue) {
                
                String sql = "SELECT ename, sal FROM emp";
                rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    String ename = rs.getString("ename");
                    int sal = rs.getInt("sal");
                    System.out.printf("%s 직원의 월급은 %,d달러입니다.%n", ename, sal);
                }
            } else {
                
                String sql = "SELECT ename, hiredate FROM emp ORDER BY hiredate";
                rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    String ename = rs.getString("ename");
                    java.sql.Date hiredate = rs.getDate("hiredate");
                    System.out.printf("%s 직원은 %tY년 %<tm월 %<td일에 입사하였습니다.%n", ename, hiredate);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


