package in.Sandeep.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public boolean saveUser(String uname, String email,String pwd)
	{
		System.out.println("Record saved successs......");
		return true;
		
	}

}
