package jdbcexam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class VisitorList {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "jdbctest";
	    String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
		Statement stmt = conn.createStatement();
		String sql = "SELECT id, name, writedate, memo FROM visitor";
		ResultSet rs = stmt.executeQuery(sql);		
		while(rs.next()) {
			System.out.print(rs.getString("id")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getString("writedate")+"\t");
			System.out.println(rs.getString("memo"));
		}	
		rs.close();
		stmt.close();
		conn.close();
	}
}




