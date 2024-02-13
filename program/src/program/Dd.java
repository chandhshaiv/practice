package program;
import java.util.*;


public class Dd {
	public static void main (String args[])
	{
		List<String> num=new ArrayList<String>();
		
		System.out.println("ist of numbers");
		num.add("one");
		num.add("two");
		num.add("three");
		num.add("four");
		num.forEach(System.out::println);
	}

}
