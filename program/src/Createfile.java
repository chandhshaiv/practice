import java.io.File;

public class Createfile {

	public static void main(String[] args) {
		//  creatig folder
		//boolean file=new File("src/abc").mkdirs();
		File file=new File("C:\\Users\\Admin\\Desktop\\apponix\\practice\\program\\src/log1.txt");

		try {
			file.createNewFile();
			System.out.println("check");
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	
}




