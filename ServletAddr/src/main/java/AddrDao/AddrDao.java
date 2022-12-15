package AddrDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AddrDao {
	public Connection conn = null;
	public PreparedStatement pstmt=null;
	public Statement stmt=null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	ResultSet rs= null;
	
	public static AddrDao sd=new AddrDao();
	public static AddrDao getDao() {
		return sd;
	}

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
	
	public void insert(Member p) {
		con();
		String sql="insert into addr values(addr_seq.nextval,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setString(2, p.getTel());
			pstmt.setString(3, p.getAddress());
			pstmt.setInt(4, p.getPostal());
			pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
		
	}
	//전체 출력
	public ArrayList<Member> getAll(){
		con();
		ArrayList<Member> list= new ArrayList<Member>();
		String sql="select * from addr order by num";
			
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int num= rs.getInt(1);
				String name= rs.getString(2);
				String tel= rs.getString(3);
				String address= rs.getString(4);
				int Postal= rs.getInt(5);
				Member p = new Member(num,name,tel,address,Postal);
				list.add(p);
			}
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
		return list;
	}
	//검색
	public Member getMember(int num) {
			con();
			String sql="select * from addr where num=?";
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					int num1= rs.getInt(1);
					String name= rs.getString(2);
					String tel= rs.getString(3);
					String address= rs.getString(4);
					int Postal= rs.getInt(5);
					Member p = new Member(num1,name,tel,address,Postal);
					return p;
				}
				
			} catch(Exception e) {
				System.out.println(e);
			} finally {
				discon();
			}
			
		return null;
	}
	public void edit(Member p) {
		con();
		String sql="update addr set name=?,tel=?,address=?,Postal=? where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setString(1, p.getTel());
			pstmt.setString(1, p.getAddress());
			pstmt.setInt(1, p.getPostal());
			pstmt.setInt(1, p.getNum());
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}
	public void delete(int num2) {
		con();
		String sql="delete addr where num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num2);
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
	}
}
