package package1.com;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program2 {
	
	
	@GetMapping("/chandu/ran")
	public int give()
	{
		Random data=new Random();
		int num=data.nextInt(10)+2;
		return num;
	}
	

}
