package package2.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class View {
	@Autowired
private   Extend1  conn;
	
	public void add(Model user){
		user.setId(45);
		user.setPlace("kote");
		user.setFamous("kabibi");
		user.setAmount(5000);
		conn.insert(user);
	}



public Model add1(Model user) {
	user.setId(88);
var info=conn.findById(user.getId()).orElse(null);
//System.out.println(info);
	return info;
}

public Model updateData(Model user1) {
	user1.setId(1999);
	var data=conn.findById(user1.getId()).orElse(null);
	System.out.println(data);
	if( data !=null) {
		data.setPlace("mysore");
		data.setId(2000);
		conn.insert(data);
	var data1=conn.findById(user1.getId()).orElse(null);
	if(data1 !=null) {
		user1.setId(1999);
		conn.delete(user1);		}
}
	return data;
}
public void deleteSomething(Model info) {
	info.setId(125);
	conn.delete(info);
}
}





 
	
	









	


