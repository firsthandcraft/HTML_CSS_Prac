package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDao {
	public Connection conn = null;
	public PreparedStatement pstmt=null;
	public Statement stmt=null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	ResultSet rs= null;

	public static ProductDao sd=new ProductDao();
	
	private ProductDao() {
		// TODO Auto-generated constructor stub

	}

	public static ProductDao getDao() {
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
	
	public void insert(ProductVO p) {
		con();
		String sql ="insert into p_PRODUCT values(s_pno.nextval,?,?,?,?)";
				
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getPname());
			pstmt.setString(2, p.getPmaker());
			pstmt.setString(3, p.getPprice());
			pstmt.setString(4, p.getPdetail());
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		

	}
	//전체출력
	public ArrayList<ProductVO> getAll(){
		con();
		ArrayList<ProductVO> list= new ArrayList<ProductVO>();
		String sql = "select * from p_PRODUCT order by pno";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int num = rs.getInt(1);
				String pname=rs.getString(2);
				String pmaker=rs.getString(3);
				String pprice=rs.getString(4);
				String pdetail=rs.getString(5);
				
				ProductVO m =new ProductVO(num,pname,pmaker,pprice,pdetail);
				list.add(m);
			}

		} catch(Exception e) {
			System.out.println(e);
		} finally {
			discon();
		}
		
		return list;
		
	}
	


public ProductVO getMember(int num) {
	con();
	String sql = "select * from p_PRODUCT where pno=?";
	try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int pno=rs.getInt(1);
			String pname=rs.getString(2);
			String pmaker=rs.getString(3);
			String pprice=rs.getString(4);
			String pdetail=rs.getString(5);
			ProductVO m =new ProductVO(pno,pname,pmaker,pprice,pdetail);
			return m;
		}
	} catch(Exception e) {
		System.out.println(e);
		
	} finally {
		discon();
	}
	
	return null;
}
	public void edit(ProductVO p) {
		con();
		String sql = "update p_PRODUCT set pname=?,pmaker=?,pprice=?,pdetail=? where pno=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getPname());
			pstmt.setString(2, p.getPmaker());
			pstmt.setString(3, p.getPprice());
			pstmt.setString(4, p.getPdetail());
			pstmt.setInt(5, p.getPno());
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		
	}
	public void delete(int num2) {
		con();
		String sql = "delete p_PRODUCT where pno=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num2);
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			System.out.println(e);
			
		} finally {
			discon();
		}
		
	}

}