package package1.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chandu {
	
	
	@GetMapping("/apii/str")
	public String data1() {
		return"abcd";
		
		
	}
	@GetMapping("/apii/num")
	public String data2() {
		return"chai";
	

}
	
	@PutMapping("/apii/chr")
	public String data3() {
		return"shru";
	

}
}
