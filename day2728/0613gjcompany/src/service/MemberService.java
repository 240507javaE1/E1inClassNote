package service;

import java.util.List;

import model.Member;

public interface MemberService {
	//create
	void addMember(Member m);
	
	//read
	List<Member> queryAll();
	Member queryById(int id);
	Member queryMember(String username,String password);
	
	//update
	void updateMember(int id,String membername);
	void updateMember(int id,String membername,String address);
	
	//delete
	void deleteId(int id);

}