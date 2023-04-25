package filehandlingdemocode;
import java.io.*;
public class createfile {

	public static void main(String[] args)throws Exception {
		File f =new File ("filehandiling.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());

	}

}
