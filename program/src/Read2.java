
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try{
	var file =new File("C:\\Users\\Admin\\Desktop\\apponix\\practice\\program\\src/log1.txt");
	var data=new Scanner(file);
	while(data.hasNext()) {
		var nydata=data.nextLine();
		System.out.println(nydata);
	}
	
}catch(FileNotFoundException e) {
	System.out.println(e);
	
}

	}
}


