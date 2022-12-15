package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	public String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	public String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
	ResultSet rs = null;
	
	private static BookDao sd = new BookDao();

	private BookDao() {
	}

	public static BookDao getDao() {
		return sd;
	}
	
	public boolean con() {
		// TODO Auto-generated method stub
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}


	public void discon() {
		// TODO Auto-generated method stub
		try {
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insert(BookVo p) {
		// TODO Auto-generated method stub
		con();
		String sql ="insert into book values(Book_seq.nextval,?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getAuthor());
			pstmt.setString(2,p.getTitle());
			pstmt.setString(3,p.getPublisher());
			pstmt.setString(4,p.getContent());
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		
	}
	
	public ArrayList<BookVo> getAll() {
		// TODO Auto-generated method stub
		con();
		ArrayList<BookVo> list= new ArrayList<BookVo>();
		String sql ="select * from book order by num";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int num = rs.getInt(1);
				String author=rs.getNString(2);
				String title=rs.getNString(3);
				String publisher=rs.getNString(4);
				String content=rs.getNString(5);
				BookVo m =new BookVo(num,author,title,publisher,content);
				list.add(m);
			}
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		return list; 
	}
	public BookVo getMember(int num) {
		// TODO Auto-generated method stub
		con();
		String sql ="select * from book where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int pno = rs.getInt(1);
				String author=rs.getString(2);
				String title=rs.getString(3);
				String publisher=rs.getString(4);
				String content=rs.getString(5);
				BookVo m = new  BookVo(pno,author,title,publisher,content); 
				return m;
			}

		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		return null;
	}

	public void edit(BookVo p) {
		// TODO Auto-generated method stub
		con();
		String sql ="update book set author=?,title=?,publisher=?,content=? where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getAuthor());
			pstmt.setString(2,p.getTitle());
			pstmt.setString(3,p.getPublisher());
			pstmt.setString(4,p.getContent());
			pstmt.setInt(5,p.getNum());
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		
	}

	public void delete(int num) {
		// TODO Auto-generated method stub
		con();
		String sql ="delete book where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
	}
	
	
	
	
	
	
	
	
	
}
