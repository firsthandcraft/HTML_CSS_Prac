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
	//전체출력
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
	//검색
	public ArrayList<MemberVO>getFindMemberList(String id){
		con();
		ArrayList<MemberVO>list = new ArrayList<MemberVO>();
		try {
			String sql = "select name,password,address from member where id=?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				list.add(new MemberVO(id,rs.getString(1),rs.getString(2),rs.getString(3)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}
	//회원가입
	public void addMemberList(MemberVO vo){
			con();
			
			try {
				String sql = "insert into member(id,password,name,address)values(?,?,?,?)";
				pstmt= conn.prepareStatement(sql);
				pstmt.setString(1,vo.getId());
				pstmt.setString(2,vo.getPassword());
				pstmt.setString(3,vo.getName());
				pstmt.setString(4,vo.getAddress());
				int result= pstmt.executeUpdate();
				System.out.println("insert : " +result);
				
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				discon();
			}
	}
	
	//로그인
	public ArrayList<MemberVO>LoginMemberList(String id,String password){
		con();
		ArrayList<MemberVO>list = new ArrayList<MemberVO>();
		try {
			String sql = "select * from member where id=? and password=?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				list.add(new MemberVO(id,password,rs.getString(2),rs.getString(3)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}
	
	
}
