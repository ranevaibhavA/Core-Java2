package IO_FileHandling;

	import java.io.File;

	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
import java.util.Collections;

	public class FileWriterDemo {

		public static void main(String[] args) throws Exception {
			System.out.println("creating a file f1...");
			
			File f1=new File("C:\\java\\test33.txt");
			
			System.out.println("checking if file exists: "+f1.exists());
			
			System.out.println("hey its not existing!!!!....");
			
			System.out.println("f1 object of file was just pointing to that file....it  hasn't been created ");
			
			System.out.println("lets create it!!!!");
			// f1.createNewFile(); -->it shows to use throws or handle exception 
			
			f1.createNewFile();
			
			System.out.println("lets check it now...");
			
			System.out.println(f1.exists()+" hey...it has been created....woooooo!!!!!!!");
			
			System.out.println("lets write something on this file...");
			//to write  use File Writer object to write character on a file
			//FileWriter fw = new FileWriter(f1);-->it shows to use throws or handle exception
		
			FileWriter fw = new FileWriter(f1);
			
			
			fw.write("hello m new data on your fileee");
			fw.write("hey m a new student");
			System.out.println("succefully written");
			fw.flush();
			fw.close();
			
			FileReader fw1=new FileReader(f1);
			
			//System.out.println(fw1.read());
			
			char c[]=new char[(int) f1.length()];
			System.out.println("reading from file...");
			fw1.read(c);
			for(char ch:c) {									//for each loop
				System.out.print(ch);
			}
		
			fw1.close();
		}

	}


