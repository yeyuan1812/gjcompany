package Dao.porder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import Dao.DbConnection;
import Model.porder;

public interface porderDao {

	//連線方法
	/*static Connection getDB()                       //因為現在有兩張表(member.porder)所以共同使用Dbconnection
	{
		Connection conn=DbConnection.getDB();
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="1234";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;
	}*/
	
	
	//Create
	void add(porder p);
		
	
	//Read
	List<porder> selectAll();
	porder selectId(int id);
		
	
	//Update
	void update(porder p);
	
	
	//Delete
	void delete(int id);
}
