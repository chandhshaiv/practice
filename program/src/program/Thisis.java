package program;

public class Thisis 
{
	
	

	int a;
	int b;
	int c;

	void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=this.a+this.b;
	//this keyword reference the current variable
		
		System.out.println(" c is "  + c);
		
	}

 
	 public static void main(String[] args)
	 {
		
	
	 Thisis obj=new  Thisis();
	 obj.add(2,3);
	}
	}
	 
	



