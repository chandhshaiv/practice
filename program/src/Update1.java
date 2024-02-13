

import java.io.FileWriter;
import java.net.InetAddress;

public class Update1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileNmae="C:\\Users\\Admin\\Desktop\\apponix\\practice\\program\\src/log1.txt";
		try {
			var fw=new FileWriter(fileNmae,true);	
			InetAddress IP = InetAddress.getLocalHost();
			fw.append("IP of my system is := "+IP.getHostAddress());
			fw.close();
			System.out.println("appended");
		}catch(Exception e) {
			System.out.println(e); 
			
		}
	
	}

}
