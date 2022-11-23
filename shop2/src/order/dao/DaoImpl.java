package order.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Order;
import model.Product;

public class DaoImpl implements Dao {
	private DBConnect db;
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public Order o=null;
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
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public void insert(Order o) {
		// TODO Auto-generated method stub
		String sql="insert into shop_order values(seq_shop_order.nextval,?,?,?,?,sysdate,?,0)";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,o.getPro_num());
			pstmt.setInt(2,o.getOrder_num());
			pstmt.setInt(3,o.getTotal_price());
			pstmt.setString(4,o.getO_id());
			pstmt.setInt(5,o.getO_state());
			//pstmt.setInt(6,o.getD_state());
			//pstmt.setString(5,o.getProd_name());
			//pstmt.setString(8,o.getProd_img());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public Order select(int num) {
		// TODO Auto-generated method stub
		String sql="select * from shop_order where num =?";
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			rs =pstmt.executeQuery();
			if(rs.next()) {
				o =new Order(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getDate(6),rs.getInt(7),rs.getInt(8));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return o;
	}

	@Override
	public ArrayList<Order> selectAll(String o_id, int o_state) {
		// TODO Auto-generated method stub
		String sql="select * from shop_order where o_id =? and o_state=?";
		ArrayList<Order> orders= new ArrayList<Order>();
		try {
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1,o_id);
			pstmt.setInt(2,o_state);
			rs =pstmt.executeQuery();
			while(rs.next()) {
				orders.add(new Order(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getDate(6),rs.getInt(7),rs.getInt(8)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return orders;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql="delete shop_order where num =?";
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

	@Override
	public void update(String type, int num) {
		// TODO Auto-generated method stub
		try {
			String sql="update shop_order set where type=? and num =?";
			conn= db.getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, type);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}
	
	
	
	
	}


