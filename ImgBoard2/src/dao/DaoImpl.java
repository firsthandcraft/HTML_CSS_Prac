package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.transform.Result;

import conn.DBConnect;
import model.Product;

public class DaoImpl implements Dao {
	
	private DBConnect db;
	public Connection conn = null;
	public PreparedStatement pstmt= null;
	public ResultSet rs=null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	
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
	

	public void insert(Product p) {
		// TODO Auto-generated method stub
		con();
		try {
			Connection conn = db.getConnection();
			String sql="insert into shop_product values(?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, p.getNum());
			pstmt.setString(2, p.getName());
			pstmt.setInt(3,p.getQuantity());
			pstmt.setInt(4, p.getPrice());
			pstmt.setString(5, p.getImg());
			pstmt.setString(6, p.getContent());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}

	
	public Product select(int num) {
		// TODO Auto-generated method stub
		con();
		Product product=null;
		try {
			Connection conn = db.getConnection();
			String sql="select * from shop_product where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				product= new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return product;
	}
	
	public void update(Product p) {
		// TODO Auto-generated method stub
		con();
		/*if(p.getImg()!=null) {
			try {
				String sql="update shop_product set name=?,quantity=?,price=?,img=?,content=? where num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, p.getName());
				pstmt.setInt(2,p.getQuantity());
				pstmt.setInt(3, p.getPrice());
				pstmt.setString(4, p.getImg());
				pstmt.setString(5, p.getContent());
				pstmt.setInt(6, p.getNum());
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				discon();
			}
		} else {
			try {
				String sql="update shop_product set name=?,quantity=?,price=?,content=? where num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, p.getName());
				pstmt.setInt(2,p.getQuantity());
				pstmt.setInt(3, p.getPrice());
				pstmt.setString(4, p.getContent());
				pstmt.setInt(5, p.getNum());
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				discon();
			}
		}*/
		String sql1="update shop_product set name=?,quantity=?,price=?,content=? ,img=?where num=?";
		String sql2="update shop_product set name=?,quantity=?,price=?,content=? where num=?";
			try {
				if(p.getImg()!=null) {
					pstmt=conn.prepareStatement(sql1);	
				}else {
				pstmt=conn.prepareStatement(sql2);
				}
				pstmt.setString(1, p.getName());
				pstmt.setInt(2,p.getQuantity());
				pstmt.setInt(3, p.getPrice());
				pstmt.setString(4, p.getContent());
				if(p.getImg()!=null) {
				pstmt.setString(5, p.getImg());
				pstmt.setInt(6, p.getNum());
				} else {
					pstmt.setInt(5, p.getNum());
				}
				pstmt.executeUpdate();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				discon();
			}
	}

	public void delete(int num) {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="delete from shop_product where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		
	}

	public int selectNum() {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="select seq_shop_product.nextval from dual";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return 0;
	}

	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		con();
		ArrayList<Product> products=new ArrayList<Product>();
		try {
			String sql="select * from shop_product";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				products.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return products;
	}

	
	//수량체크
	public void updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		con();
		try {
			String sql="";
			pstmt=conn.prepareStatement(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}

	}



	

}
