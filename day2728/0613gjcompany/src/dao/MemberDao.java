package dao;

import java.util.List;

import model.Employee;
import model.Member;

public interface MemberDao {
	//create
			void add(Member m);
			
			//read
			List<Member> selectAll();
			List<Member> selectById(int id);
			List<Member> selectMember(String username,String password);
			
			
			
			//update
			void update(Member m);
			
			//delete

			void delete(int id);


			

}