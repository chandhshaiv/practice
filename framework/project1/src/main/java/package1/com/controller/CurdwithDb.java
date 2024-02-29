package package1.com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import package1.com.model.UserInfoSchema;
import package1.com.services.UserCurd;



@RestController
public class CurdwithDb{

	@Autowired
	private UserCurd services;
	
	@GetMapping("/save")
	public String addUserInfoToDb(UserInfoSchema user) {
		services.addUser(user);
		return "added";
	}
}
