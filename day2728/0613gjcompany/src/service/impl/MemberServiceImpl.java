package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import model.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		System.out.println(new MemberServiceImpl().queryMember("def", "222"));
	}

	private static MemberDaoImpl mdi=new MemberDaoImpl();
	
	@Override
	public void addMember(Member m) {
		mdi.add(m);
		
	}

	@Override
	public List<Member> queryAll() {
		// TODO Auto-generated method stub
		
		return mdi.selectAll();
	}

	@Override
	public Member queryById(int id) {
		List<Member> l=mdi.selectById(id);
		Member[] m=l.toArray(new Member[1]);
		
		return m[0];
	}

	@Override
	public void updateMember(int id, String membername) {
		Member m=queryById(id);
		m.setMembername(membername);
		
		mdi.update(m);
		
	}

	@Override
	public void updateMember(int id, String membername, String address) {
		Member m=queryById(id);
		m.setMembername(membername);
		m.setAddress(address);
		mdi.update(m);
		
	}

	@Override
	public void deleteId(int id) {
		mdi.delete(id);
		
	}

	@Override
	public Member queryMember(String username, String password) {
		List<Member> l=mdi.selectMember(username, password);
		Member[] m=l.toArray(new Member[1]);		
		
		return m[0];
	}

}