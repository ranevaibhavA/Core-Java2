package IO_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriteReaderDemo {

	public static void main(String[] args) throws Exception {
		// one way
		// BufferedWriter bw=new BufferedWriter(new FileWriter("xyz.txt"));

		// 2nd way
		File f1 = new File("E:\\\\java hefshine\\\\FileHandling\\\\BufferReaderDemo.txt");					//it pointing that file as f1
		FileWriter f2 = new FileWriter(f1, true);		//it append the text which is on console
		BufferedWriter bw = new BufferedWriter(f2);
		bw.write("hello");
		bw.write(100); 				// it not support primitive datatype hence it will write character of that ascii
									// code
		bw.write('a');
		bw.newLine(); 				// it return the cursor on nextline
		bw.write("abcfdhdhjg");

		bw.flush(); 				// it copy the element from console to file it may occur
		System.out.println("written");
		bw.close();					//it saves the text file

	}

}
