package IO_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("E:\\java hefshine\\FileHandling\\BufferReaderDemo.txt"));
		String s = br.readLine();
		while (s != null) { 						// read while length is null
			//System.out.println(s);

			s = br.readLine();

		}
		br.close();

for(int i=0;;) {
	System.out.println(i);
}

	
	}

}
