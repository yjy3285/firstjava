package mvclab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mvc.model.service.ConnectJdbcTest;

public class StudentDAO {
	
	public boolean insertStudent(StudentDTO dto) {
		
		boolean result = true;
		Connection conn = ConnectJdbcTest.connect();
		
		try (PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student(name,score) VALUES(?,?)");) {
			pstmt.setString(1,  dto.getName());
			pstmt.setInt(2,  dto.getScore());
			
			pstmt.executeUpdate();
		}catch (SQLException e) {
			result = false;
			e.printStackTrace();
		}finally {
			ConnectJdbcTest.close(conn);
		}
		return result;
						
		}
	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> list = new ArrayList<>();
		Connection conn = ConnectJdbcTest.connect();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery
						("select name,score from student");) {
			
			while(rs.next()) {
				StudentDTO dto;
			    dto = new StudentDTO();
			    dto.setName(rs.getString(1));
			    dto.setScore(rs.getInt(2));
			    list.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectJdbcTest.close(conn);
		}
		return list;
	
	}
	public int getScore(StudentDTO dto) {
		
		Connection conn = ConnectJdbcTest.connect();
		int score = -1;
		
		try(PreparedStatement pstmt = conn.prepareStatement("Select score From student where name =?");){
			pstmt.setString(1, dto.getName());
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					score = rs.getInt("score");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectJdbcTest.close(conn);
		}
		return score;
	}
		
	public boolean updateStudent(StudentDTO dto) {
		boolean result = true;
		Connection conn = ConnectJdbcTest.connect();
		try (PreparedStatement pstmt = conn.prepareStatement(
						"update student set score = ? where name = ?");) {
			pstmt.setInt(1, dto.getScore());
			pstmt.setString(2, dto.getName());
			
			pstmt.executeUpdate();			
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		} finally {
			ConnectJdbcTest.close(conn);
		}
		return result;
	}
	public boolean deleteStudent(StudentDTO dto) {
		boolean result = true;
		Connection conn = ConnectJdbcTest.connect();
		try (PreparedStatement pstmt = conn.prepareStatement(
						"delete from student where name= ?");) {
			pstmt.setString(1, dto.getName()); 
			
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			result = false;
			e.printStackTrace();
		} finally {
			ConnectJdbcTest.close(conn);
		}
		return result;
	}


	
	}

		;
		
	



