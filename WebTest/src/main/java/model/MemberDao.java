package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.transform.Result;

public class MemberDao  {

	Connection conn = null;
	PreparedStatement pstmt=null;
	ResultSet rs= null;
	public void con() {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver ok");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//주소 아이디 패스워드
		System.out.println("connection ok");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public void discon() {
		// TODO Auto-generated method stub
		try {
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}
	
	public ArrayList<MemberVO> getAllMemberList(){
		con();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			String sql="select id, password,name,address from member";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
			
			
 		} catch(SQLException e) {
 			e.printStackTrace();
 		} finally {
 			discon();
 		}
		
		
		
		
		return list;
	}
	
	
	
	
	
	
}
