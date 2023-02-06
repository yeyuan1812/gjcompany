package Dao.porder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.porder;

public class implPorder implements porderDao{

	public static void main(String[] args) {
		//System.out.print(porderDao.getDB());        //測試用
		/*porder p=new porder("B桌",3,0,4);
		new implPorder().add(p);*/
		//System.out.println(new implPorder().selectAll());  //測試記憶體位置
		//System.out.println(new implPorder().selectID(2));
		//porder p=new implPorder().selectId(4);
		//p.setDesk("C桌");
		//new implPorder().update(p);
		
		//new implPorder().delete(4);    //database的id 是給內部的人看得，所以刪掉就不會再使用那個號碼
		
	}

	@Override
	public void add(porder p) {
		Connection conn=DbConnection.getDB();
		String SQL="insert into porder(desk,A,B,C) "
				+"values(?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<porder> selectAll() {
		
		/*
		 * 1.List<porder> l-->selectAll()
		 * 2.String-->for-each-->顯示
		 * 3.List--->轉陣列--->toArray-->顯示 , 統計分析
		 */
		
		Connection conn=DbConnection.getDB();
		String SQL="select * from porder";
		List<porder> l=new ArrayList();
		try {
			PreparedStatement p=conn.prepareStatement(SQL);
			ResultSet rs=p.executeQuery();
			
			while(rs.next())
			{
				porder p1=new porder();
				p1.setId(rs.getInt("id"));
				p1.setDesk(rs.getString("desk"));
				p1.setA(rs.getInt("A"));
				p1.setB(rs.getInt("B"));
				p1.setC(rs.getInt("C"));
				
				l.add(p1);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public porder selectId(int id) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from porder where id=? ";
		porder p=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				p=new porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public void update(porder p) {
		Connection conn=DbConnection.getDB();
		String SQL="update porder set desk=?,A=?,B=?,C=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		Connection conn=DbConnection.getDB();
		String SQL="delete from porder where id=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);			
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
