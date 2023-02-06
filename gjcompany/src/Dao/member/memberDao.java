package Dao.member;

import java.util.List;

import Model.member;

public interface memberDao {
	    //Create新增
		//void add(String name,String username,String password,String address,String phone,String mobile);  //這樣打太長
		void add(member m);//inject注入  ，直接用member放入 
		
		//read查詢
		String queryAll1();          //全部資料接在一起
		List<member> queryAll2();      //每筆資料一筆一筆，獨立運算
		                               //先在SQL一筆資料，再思考你要怎麼做
		member queryID(int id);
		member queryMember(String username,String password);  //你只要一繼承方法，介面就會要你override
		boolean queryUser(String username);  //確認帳號是否重複
		
			                            
		
		//update修改
		void update(member m);      //因為沒有要回傳值，用void
		
		
		//delete刪除
		void delete(int id);
}
