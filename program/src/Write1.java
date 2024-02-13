


import java.io.FileWriter;
import java.util.Date;

public class Write1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			var mydate=new Date();
			var wr=new FileWriter("C:\\Users\\Admin\\Desktop\\apponix\\practice\\program\\src/log1.txt");	
			wr.write("client:name:chandan----"+"Datae"+ mydate);
			wr.close();
			System.out.println("inserted");
		}catch(Exception e){
			System.out.println(e);
		}
		

	}

}
