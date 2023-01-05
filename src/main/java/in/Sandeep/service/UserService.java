package in.Sandeep.service;

import org.springframework.stereotype.Service;

import in.Sandeep.dao.UserDao;

@Service
public class UserService {
	 private UserDao userDao;
	 
	 public UserService(UserDao userDao) {
		// TODO Auto-generated constructor stub
		 this.userDao=userDao;
	}
	 
	public void registerUser()
	{
		boolean isSaved = userDao.saveUser("sandeep", "sandy@gmail.com", "sandy123");
		
		if(isSaved)
		{
			System.out.println("Record saved Successfully....");
		}
		else
		{
			System.out.println("Record not saved successfully...");
		}
	}
	 
	 
}
