package IO_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintReaderDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new FileReader("C:\\java\\testing.txt"));
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
		br.close();

	}


}
