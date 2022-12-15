package service;

import java.util.ArrayList;

import AddrDao.AddrDao;
import AddrDao.Member;

public class EventService {
	private AddrDao dao;
	public EventService() {
		dao=AddrDao.getDao();
	}
	public void insert(Member p) {
		dao.insert(p);
	}
	public  ArrayList<Member> list(){
		return dao.getAll();
	}
	public Member getMember(int num) {
		return dao.getMember(num);
	}
	
	public void edit(Member p) {
		dao.edit(p);
	}
	public void update(int num2) {
		dao.delete(num2);
	}
	public void delete(int num2) {
		dao.delete(num2);		
	}
}
