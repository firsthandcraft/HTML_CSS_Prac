package service;

import java.sql.SQLException;

import model.MemberDao;
import model.MemberVO;

public class MemberService {
	private MemberDao dao;
	public MemberService () {
		dao= new MemberDao();
	}
	public void insert(MemberVO vo) throws SQLException {
		dao.insertMember(vo);
	}
	
	public boolean isExist(String id)throws SQLException {
		return dao.isExist(id);
	}
	public MemberVO login(String id,String pwd)throws SQLException{
		return dao.login(id, pwd);
	}
	
	public MemberVO getMember(String id) throws SQLException {
		// TODO Auto-generated method stub
		return dao.findMember(id);
	}
	
	public void edit(MemberVO m) throws SQLException {
		// TODO Auto-generated method stub
		dao.updateMember(m);
	}

}
