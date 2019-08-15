package IO_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//2.	Write a program to input data (numbers, characters), store in a.txt file, 
//read it and separate the contents in two different files namely char.txt and number.txt.
public class NumberAndChar_2nd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("E:\\java hefshine\\FileHandling\\NumberAndCharFile.txt");

		f1.createNewFile();
		File f2 = new File("E:\\java hefshine\\FileHandling\\Numberfile.txt");
		f2.createNewFile();
		FileWriter frnum = new FileWriter(f2);

		File f3 = new File("E:\\java hefshine\\FileHandling\\charfile.txt");
		f3.createNewFile();
		FileWriter frchar = new FileWriter(f3);
		FileInputStream file = new FileInputStream(f1);
		FileOutputStream foutStream = new FileOutputStream(f2);
		FileOutputStream foutStream1 = new FileOutputStream(f3);

		FileWriter fr = new FileWriter(f1);

		BufferedWriter bw = new BufferedWriter(fr);

		PrintWriter Pw = new PrintWriter(bw);

		Pw.print(10);
		Pw.write("hello");
		Pw.write("aa");
		Pw.write('b');
		Pw.flush();
		Pw.close();
		System.out.println("Written");
		int i = 0;
		
		while ((i = file.read()) != -1) {
			if (i >= 48 && i <= 57) {
				foutStream.write(i);
				foutStream.flush();
			} else {
				foutStream1.write(i);
				foutStream1.flush();
			}
			frnum.close();
			frchar.close();
	
		}
		System.out.println("done");
	}

}
