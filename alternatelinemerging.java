package filehandlingdemocode;
import java.io.*;
public class alternatelinemerging {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("F:\\JAVA CODES\\filehandling codes\\filehandling\\filehandling3.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA CODES\\filehandling codes\\filehandling\\filehandling.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("F:\\JAVA CODES\\filehandling codes\\filehandling\\filehandling1.txt"));

		String line = br.readLine();
		String line1= br1.readLine();
		while(line != null || line1 != null) {
			if(line!=null) {
				pw.println(line);
			line=br.readLine();
			}
			if(line1 != null) {
				pw.println(line1);
				line1 = br1.readLine();
			}
		}
		pw.flush();
		pw.close();
		br.close();
		br1.close();
		
	}

}
