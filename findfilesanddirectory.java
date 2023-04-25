package filehandlingdemocode;
import java.io.*;
public class findfilesanddirectory {

	public static void main(String[] args) {
		File f = new File("F:\\JAVA CODES\\filehandling codes\\filehandling");
	String[] s=	f.list();
	for(String s1 :s) {
		File f1 =new File(f,s1);
		if(f1.isFile()) {
			System.out.println(s1);
		}
	}
	}

}
