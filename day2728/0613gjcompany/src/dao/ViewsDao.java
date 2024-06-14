package dao;

import java.util.List;

import model.views.MemberGroupbyMemberNo;

public interface ViewsDao {
	//MemberGroupbyMemberNo
	List<MemberGroupbyMemberNo> selectAll();
	List<MemberGroupbyMemberNo> selectBy平均(int 平均);
	
	//

}