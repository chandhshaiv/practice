package package1.com.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import package1.com.dao.UserConnectSchemaDb;
import package1.com.model.UserInfoSchema;


@Service
public class UserCurd {
	@Autowired
private   UserConnectSchemaDb  con;
	
	public void addUser(UserInfoSchema user){
		user.setName("manoj");
		user.setChocalate("kitkat");
		con.insert(user);
	}
}
