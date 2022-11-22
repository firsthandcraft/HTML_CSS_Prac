package product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import conn.DBConnect;
import model.Product;

public class DaoImpl implements Dao {
	
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public Product product=null;
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
	//
	public void insert(Product p) {
		// TODO Auto-generated method stub
		String sql="insert into shop_product values(seq_shop_product.nextval,?,?,?,?,?,?)";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getQuantity());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getImg());
			pstmt.setString(5, p.getContent());					
			pstmt.setString(6, p.getS_id());					
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	
	public Product select(int num) {
		// TODO Auto-generated method stub
		String sql="select * from shop_product where num =?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				product =new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),"");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		
		return product;
	}
	//등록했던 아이디를 가져온다.
	//s_id 를 통해 항목별로 나온 리스트 출력
	//구매자는 - 모든 리스트를 볼수 잇게  - 이미지 전체 볼수 있다. 
	//판매가는 판매 올린 리스트만 볼수 잇게 -> 수정 가능 상품번호랑 상품명 새상품 등록
	public ArrayList<Product> selectAllById(String s_id) {
		// TODO Auto-generated method stub
		String sql="select * from shop_product where s_id =?";
		ArrayList<Product> products= new ArrayList<Product>();
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,s_id);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				products.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),""));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return products;
	}

	

	public void update(Product p) {
		// TODO Auto-generated method stub
		try {
			String sql="update shop_product set name=?,quantity=?,price=?,content=?,img=? where num=?";
			String sql2="update shop_product set name=?,quantity=?,price=?,content=? where num=?";
			conn= db.getConnection();
			if(p.getImg()!=null) {
				pstmt= conn.prepareStatement(sql);
			} else{
				pstmt= conn.prepareStatement(sql2);
			}
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getQuantity());
			pstmt.setInt(3, p.getPrice());
			pstmt.setString(4, p.getContent());
			if(p.getImg()!=null) {
				pstmt.setString(5, p.getImg());		
				pstmt.setInt(6, p.getNum());
			} else {
				pstmt.setInt(5, p.getNum());
			}
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		
	}

	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql="delete shop_product where num =?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, num);				
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		}
	

	
	
	
	public int selectNum() {
		// TODO Auto-generated method stub
		String sql="select seq_shop_product.nextval from dual";
		int num=0;
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				num=rs.getInt(1);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return num;
	}

	
	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		String sql="select * from shop_product order by num";
		ArrayList<Product> list= new ArrayList<Product>();
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				Product product =new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),"");
				list.add(product);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}

	
	
	public void updateQuantity(int q, int num) {
		// TODO Auto-generated method stub
		
	}

}
