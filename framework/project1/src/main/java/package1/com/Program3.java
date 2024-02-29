package package1.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program3 {
	
	
	@GetMapping("/chandu/ran1")
	public int give()
	{
int a=2;
int b=4;
int sum=a+b;
return sum;

}
	@GetMapping("/chandu/ran2")
	public int give1()
	{
int a=2;
int b=8;
int sum=a-b;
return sum;

}
	@GetMapping("/chandu/ran3")
	public int give2()
	{
int a=2;
int b=6;
int sum=a*b;
return sum;

}
	@GetMapping("/chandu/ran4")
	public int give3()
	{
int a=20;
int b=2;
int sum=a%b;
return sum;

}
}
