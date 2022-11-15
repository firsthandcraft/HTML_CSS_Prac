package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoImpl implements Dao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;

	public DaoImpl() {
		jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	}

	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void discon() {
		try {
			if (rs != null) {
				rs.close();
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="insert into member values(?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}

	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="select * from member where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String Uid= rs.getString(1);
				String pass= rs.getString(2);
				String name= rs.getString(3);
				String email= rs.getString(4);
				Member m = new Member(Uid,pass,name,email);
				return m;
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
		return null;

	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="update member set pwd=?,name=?,email=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="delete member where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}

	}



	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Member> list= new ArrayList<Member>(); 
		return list;
	}

}
