package package2.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller{

	@Autowired
	private View service;
	
	@GetMapping("/save3")
	public String adddata(Model user) {
		service.add(user);
		return "success1";
	}


@GetMapping("/fetch-id2")
public Model add2(Model userx) {
	
	return service.add1(userx);
}
@GetMapping("/update-celib")
public Model updateCelib(Model usery) {
	var info=service.updateData(usery);
	return info;
}

@GetMapping("/delete-celib")
public String deleting_C(Model user) {
	service.deleteSomething(user);
	return "deleted";
}
}
