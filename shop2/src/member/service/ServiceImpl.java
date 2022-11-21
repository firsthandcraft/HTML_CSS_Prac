package member.service;

import member.dao.Dao;
import member.dao.DaoImpl;
import model.Member;


public class ServiceImpl implements Service {

	private Dao dao;

	public ServiceImpl() {
		this.dao = new DaoImpl();
	}

	public void join(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return dao.select(id);
	}

	public void editMember(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	public void remMember(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
			Member m= dao.select(id);
			if(m!=null) {
				if(pwd.equals(m.getPwd())) {
					return true;
				}
			}
			/*if(m!=null || !m.getPwd().equals(pwd)){
			 * 	return false;
			 * } else{ return true;
			 * }
			 * */
			return false;
		}
	}


