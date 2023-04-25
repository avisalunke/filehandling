package filehandlingdemocode;
import java.io.*;
public class createdirectory {

	public static void main(String[] args) {
		File f=new File("filehandlingdemocodes");
		System.out.println(f.exists());
		f.mkdir();
	}

}
