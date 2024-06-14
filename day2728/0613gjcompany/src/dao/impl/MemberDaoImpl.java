package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		/*List<Member> l=new MemberDaoImpl().selectById(1);
		
		Member[] m=l.toArray(new Member[1]);
		
		m[0].setMembername("uuuuuu");
		
		new MemberDaoImpl().update(m[0]);*/
		
		
		
		//new MemberDaoImpl().delete(7);
		
		System.out.println(new MemberDaoImpl().selectMember("abc", "123"));

	}

	@Override
	public void add(Member m) {
		Connection conn=DbConnection.getDb();
		String SQL="insert into member(memberno,membername,username,password,address) values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,m.getMemberno() );
			ps.setString(2, m.getMembername());
			ps.setString(3, m.getUsername());
			ps.setString(4, m.getPassword());
			ps.setString(5, m.getAddress());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Member> selectAll() {
		Connection conn=DbConnection.getDb();
		String SQL="select * from member";
		List<Member> l=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setMembername(rs.getString("membername"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				
				
				l.add(m);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return l;
	}

	@Override
	public List<Member> selectById(int id) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from member where id=?";
		List<Member> l=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setMembername(rs.getString("membername"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				
				l.add(m);
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return l;
	}

	@Override
	public void update(Member m) {
		Connection conn=DbConnection.getDb();
		String SQL="update member set membername=?,password=?,address=? where id=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, m.getMembername());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getAddress());			
			ps.setInt(4, m.getId());
			
			
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		Connection conn=DbConnection.getDb();
		String SQL="delete from member where id=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Member> selectMember(String username, String password) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from member where username=? and password=?";
		List<Member> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setMemberno(rs.getString("memberno"));
				m.setMembername(rs.getString("membername"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				l.add(m);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return l;
	}

}