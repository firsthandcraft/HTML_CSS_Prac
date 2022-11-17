package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conn.DBConnect;
import model.Board;

public class DaoImpl implements Dao {
	private DBConnect db;
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;
	public Board b=null;

	public DaoImpl() {
		db = DBConnect.getInstance();
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
	public void insert(Board b) {
		// TODO Auto-generated method stub
		String sql="insert into board values(seq_board.nextval,?,sysdate,?,?)";
		try{con();
			conn=db.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,b.getWriter());
			pstmt.setString(2,b.getTitle());
			pstmt.setString(3,b.getContent());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {discon();}
	}

	@Override
	public Board select(int num) {
		// TODO Auto-generated method stub
		String sql="select * from board order by num where num=?";
		try{con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			rs=pstmt.executeQuery();
			if(rs.next()) {//검색결과가 있다면 컬럼값 하나씩 읽어서 Board객채를 생성하여 변환
				return new Board(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {discon();}
		
		return null;
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		String sql="select * from board order by num";
		try{
			con();
			pstmt=conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Board(rs.getInt(1),rs.getString(2),
						rs.getDate(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {discon();}
		
		return list;
	}

	@Override
	public void update(Board b) {
		// TODO Auto-generated method stub
		String sql="update board set title=?,content=?,w_date=sysdate where num =?";
		try{
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getContent());
			pstmt.setInt(3, b.getNum());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {discon();}
		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql="delete from board where num =?";
		try{
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {discon();}
	}

}
