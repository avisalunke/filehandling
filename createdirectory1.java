package filehandlingdemocode;
import java.io.*;
public class createdirectory1 {

	public static void main(String[] args) {
		File f = new File("F:\\JAVA CODES\\filehandling codes\\filehandling\\file");
		f.mkdir();
		System.out.println(f.exists());
		File f1= new File("F:\\JAVA CODES\\filehandling codes\\filehandling\\file1");
		f1.mkdir();
		
		System.out.println(f1.exists());
		
	}

}
