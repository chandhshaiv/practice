package program;

interface Doublecolon {
	 String getname();
}
class Honda{
	static  String printname()
	{
		return"honda is static";
	}
	String displayname()
	{
		return"honda is non static";
	}
	public static void main(String args[])
	{
		 Doublecolon b=()->"jonda";
		 System.out.println(b.getname());
		 
		 Doublecolon b1 = Honda::printname;
		 System.out.println(b1.getname());
		 
		 
		 Honda h=new Honda();
		 Doublecolon b2=h::displayname;
		 System.out.println(b2.getname());
		
	}

}
