package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.DBConnect;
import model.Member;

public class JoinDaoImpl implements JoinDao{

	private DBConnect db;
	
	public JoinDaoImpl() {
		db=DBConnect.getInstance();
	}
	
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		Connection conn =null;
		String sql="insert into member values(?,?,?,?)";
		PreparedStatement pstmt=null;
		try {
			// 커넥션 객체 획득
			conn= db.getConnection();
			// java에서 sql을 실행하는 PreparedStatement객체 생성
			pstmt= conn.prepareStatement(sql);
			// sql의 ?파라메터 매칭
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			// sql실행
			pstmt.executeUpdate();
		} catch(SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				// 자원 반환
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			} 
		}
	}

	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		Connection conn =null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		Member m= null;
		// 비밀 번호 안씀
		String sql="select * from member where id =?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				return new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			} 
		}
		return null;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		Connection conn =null;
		String sql="update member set password=?,name=?,email=? where id=?";
		PreparedStatement pstmt=null;
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getId());
			pstmt.executeUpdate();
		} catch(SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			} 
		}
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		Connection conn =null;
		String sql="delete member where id=?";
		PreparedStatement pstmt=null;
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.executeUpdate();
		} catch(SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			} 
		}
	}

	
}
