package service;

import java.util.ArrayList;

import model.BookDao;
import model.BookVo;

public class EventService {
	private BookDao dao;
	public EventService() {
		dao = BookDao.getDao();
	}
	public void insert(BookVo p) {
		dao.insert(p);
	}
	
	public ArrayList<BookVo> list() {
		return dao.getAll(); 
	}
	public BookVo getMember(int num) {
		return dao.getMember(num);
	}
	public void edit(BookVo p) {
		dao.edit(p);
	}
	public void delete(int num) {
		dao.delete(num);
	}

}
