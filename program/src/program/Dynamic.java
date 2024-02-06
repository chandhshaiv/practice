package program;

import java.util.Scanner;

public class Dynamic {
	 

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("enter the value of a");
		System.out.println("enter the value of b");

		int a = c.nextInt();
		int b = c.nextInt();
		
		
		 System.out.println("1.add  2.sub  3.mul .4.div");
		 int ch= c.nextInt();
		 
		 switch(ch)
		 {
		 case 1:int add = a + b;
			System.out.println("add: " + add);
			break;

		 case 2:	int sub = a - b;
			System.out.println("add: " + sub);
			break;
		 
		 case 3:	int mul = a * b;
			System.out.println("add: " + mul);
			break;
		
		 case 4:int div = a / b;
			System.out.println("add: " + div);
			break;
		 }
	}
}
	
		


