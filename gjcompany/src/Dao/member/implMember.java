package Dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.member;

public class implMember implements memberDao{

	public static void main(String[] args) {
		//member m=new member("ABC","red","000","台北","44","123");
		
		//new implMember().add(m);
		
		//System.out.println(new implMember().queryAll1());

		//System.out.println(new implMember().queryAll2());  -->看記憶體位置
		
		/*List<member> l=new implMember().queryAll2();   //-->以後都用List
		
		for(member o:l)                                   // -->裡面內容是member所以用member
		{
			System.out.println(o.getId()+"\t"+o.getName());
		}
		
		System.out.println(l.size());*/   //-->看幾筆資料
		
		//System.out.println(new implMember().queryID(3));     查詢
		//System.out.println(new implMember().queryMember("a", "120"));   查詢
		
		/*member m=new implMember().queryID(5);
		m.setPassword("AAAAAAS");
		
		new implMember().update(m);*/   //改密碼
		
		//new implMember().delete(9);    //刪資料
		System.out.println(new implMember().queryUser("we"));
		
		
	}

	@Override
	public void add(member m) {
		Connection conn=DbConnection.getDB();
		String sQL="insert into member(name,username,password,address,mobile,phone) "
				+ "values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getMobile());
			ps.setString(6, m.getPhone());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String queryAll1() {
		Connection conn=DbConnection.getDB();
		String SQL="select * from member";
		String show="";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				show=show+"id:"+rs.getInt("id")+
						"\t名:"+rs.getString("name")+
						"\t帳號:"+rs.getString("username")+
						"\t密碼:"+rs.getString("password")+
						"\t地址:"+rs.getString("address")+
						"\t行動:"+rs.getString("mobile")+
						"\t電話:"+rs.getString("phone")+"\n";
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return show;
	}

	//轉list才是我們真正要的
	public List<member> queryAll2() {
		Connection conn=DbConnection.getDB();
		String SQL="select*from member";
		List<member> l=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				member m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setPhone(rs.getString("phone"));
				l.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public member queryID(int id) {
		/*
		 * 1.連線->Connection
		 * 2.SQL-->where id=?
		 * 3.ResultSet
		 * 4.if->rs.next()
		 * 5.true-->rs-->new member()
		 * 6.false-->null
		 */
		
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where id=?";
		member m=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return m;
	}

	@Override
	public member queryMember(String username, String password) {
		/*
		 * 1.先連線-->Connection
		 * 2.SQL-->where username=? and password=?
		 * 3.if(rs.next())
		 * 4.true--->new member()-->rs填入
		 * 5.false-->null
		 */
		
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where username=? and password=?";
		member m=null;
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setPhone(rs.getString("phone"));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return m;
	}

	@Override
	public void update(member m) {
		/*
		 * 1.先連線
		 * 2.SQL-->update 全部內容 where id=?
		 * 3.preparedStatement執行
		 */
		Connection conn=DbConnection.getDB();
		String SQL="update member set name=?,username=?,password=?,address=?,mobile=?,phone=?"
				+ " where id=?";
		
		try {
			PreparedStatement ps= conn.prepareStatement(SQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5,m.getMobile());
			ps.setString(6, m.getPhone());
			ps.setInt(7, m.getId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void delete(int id) {
		/*
		 * 1.連線
		 * 2.sql-->where id=?
		 * 3.preparedStatement-->執行 
		 */
		Connection conn=DbConnection.getDB();
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
	public boolean queryUser(String username) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where username=?";
		boolean m=false;
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) m=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m;
	}
		
		
	

}