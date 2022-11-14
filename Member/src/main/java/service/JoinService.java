package service;

import model.Member;

public interface JoinService {
	void Join(Member m);
	
	Member getMember(String id);
	
	void editMember(Member m);
	
	void delMember(String id);
}
