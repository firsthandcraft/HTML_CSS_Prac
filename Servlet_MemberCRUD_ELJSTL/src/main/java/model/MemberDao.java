package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDao  {

	public Connection conn = null;
	public PreparedStatement pstmt=null;
	public Statement stmt=null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	ResultSet rs= null;
	
	public boolean con(){
		try {
			Class.forName(jdbc_driver);

			// 데이터베이스 연결정보를 이용해 Connection 인스턴스 확보
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return true;
}
	public void discon() {
		try {
			if(stmt!=null)
				stmt.close();
			if(pstmt!=null)
				pstmt.close();
			if(rs!=null)
				rs.close();
			if(conn!=null)
				conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void insertMember(MemberVO vo) throws SQLException {
		con();
		String sql="insert into member values(?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddr());
			pstmt.executeUpdate();

		}catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}
	
	//
	public boolean isExist(String id) throws SQLException {
		con();
		String sql="select id from member where id =?";
		boolean flag=false;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			flag=rs.next();			
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
		return flag;
	}
	public MemberVO login(String id, String pwd)throws SQLException {
		con();
		MemberVO vo =null;	
		String sql="select name,address from member where id=? and password=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVO(id,pwd,rs.getString(1),rs.getString(2));
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return vo;
	}
	public void updateMember(MemberVO vo) throws SQLException{
		con();
		
		String sql="update  member set password=?,name=?,address=? where id=?";
		try {
			pstmt=conn.prepareStatement(sql);			
			pstmt.setString(1,vo.getPwd());
			pstmt.setString(2,vo.getName());
			pstmt.setString(3,vo.getAddr());
			pstmt.setString(4, vo.getId());
			int result=pstmt.executeUpdate();
			System.out.println("update result:"+result);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			discon();
				
	}

	public ArrayList<MemberVO> getAllMemberList() throws SQLException{
		con();
		ArrayList<MemberVO> list=new ArrayList<MemberVO>();
		String sql="select * from member";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				list.add(new MemberVO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4)));
			}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			discon();
	        return list;
	
	
	}
	public MemberVO findMember(String id)throws SQLException  { 
		con();
		MemberVO vo=null;
		String sql="select password,name,address from member where id=?";
		try {
			pstmt=conn.prepareStatement(sql);
		    pstmt.setString(1, id);
		    rs=pstmt.executeQuery();
		    if(rs.next()){
		    	vo=new MemberVO(
		    			id,rs.getString(1),rs.getString(2),rs.getString(3));
		    }
			
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		discon();
		return vo;
		
	}

}
