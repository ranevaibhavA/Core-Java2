package IO_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException  {
		FileWriter f1=new FileWriter("C:\\java\\testing.txt");
		BufferedWriter BF=new BufferedWriter(f1);
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\java\\testing.txt")));
		PrintWriter pw=new PrintWriter(BF);
		pw.write("hey its me ");
	
		pw.print('a');
		pw.write('s');
		pw.print(121);					//in printwriter class primitive datatype is allowed
		System.out.println("written succesfully");
		pw.flush();
		pw.close();
	}


}
