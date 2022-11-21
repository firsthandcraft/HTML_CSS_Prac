package  member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import conn.DBConnect;
import model.Member;


public class DaoImpl implements Dao {
	
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public Member member= null;
	private DBConnect db;
	 
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn=DriverManager.getConnection(jdbc_url,"hr","hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void discon() {
		try {
			if(rs !=null) {
				rs.close();
			}
			//
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(Member m) {
		// TODO Auto-generated method stub
		String sql="insert into shop_member values(?,?,?,?,?,?)";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getAddr());			
			pstmt.setInt(6, m.getType());			
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		
	
	}

	public Member select(String id) {
		// TODO Auto-generated method stub
		String sql="select * from shop_member where id=?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				member=new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	
		
		return member;
	}

	
	
	public void update(Member m) {
		// TODO Auto-generated method stub
		String sql="update shop_member set pwd=?,name=?,email=?,addr=?,type=? where id=?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getAddr());			
			pstmt.setInt(5, m.getType());
			pstmt.setString(6, m.getId());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		
	}

	
	
	public void delete(String id) {
		// TODO Auto-generated method stub
		String sql="delete shop_member where id=?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		
	}

}
