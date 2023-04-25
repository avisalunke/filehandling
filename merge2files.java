package filehandlingdemocode;
import java.io.*;

public class merge2files {

	public static void main(String[] args) throws Exception {
		File f = new File("F:\\JAVA CODES\\filehandling codes\\filehandling\\filehandling.txt");
		File f1 = new File("F:\\JAVA CODES\\filehandling codes\\filehandling\\filehandling1.txt");
		
		PrintWriter pw = new PrintWriter("F:\\JAVA CODES\\filehandling codes\\filehandling\\filehandling2.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
				
		
		String line = br.readLine();
		pw.write(line);
		while(line != null) {
			pw.println(line);
			line=br.readLine();
		}
		
		br=new BufferedReader(new FileReader(f1));
		line = br.readLine();
		pw.write(line);
		while(line != null) {
			pw.println(line);
			line=br.readLine();
		}
		
		pw.flush();
		pw.close();
		br.close();
		System.out.println("lie no 29");
	}

}
