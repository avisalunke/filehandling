package filehandlingdemocode;
import java.io.*;
public class directoryinfolder {

	public static void main(String[] args) throws Exception {
		File f = new File("F:\\JAVA CODES\\filehandling codes","filehandling");
		f.mkdir();
		File f1 = new File(f,"filehandling.txt");
		f1.createNewFile();
		
		File f2 = new File(f,"filehandling1.txt");
		f2.createNewFile();
		
		PrintWriter pw = new PrintWriter(f1);
		pw.println("aaaaa");
		pw.println("bbbbb");
		pw.println("ccccc");
		pw.println("ddddd");
		
		PrintWriter pw1 = new PrintWriter(f2);
		pw1.println(11111);
		pw1.println(22222);
		pw1.println(33333);
		pw1.println(4444);
		
		pw1.flush();
		pw.flush();
		pw1.close();
		pw.close();
	}

}
