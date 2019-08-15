package IO_FileHandling;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//3.Write a program copy file contents into another file.
public class CopyFile_3rd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("E:\\java hefshine\\FileHandling\\file3.txt"); 
          
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader("E:\\java hefshine\\FileHandling\\file1.txt")); 
          
        String line = br.readLine(); 
          
        // loop to copy each line of  
        // file1.txt to  file3.txt 
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        br = new BufferedReader(new FileReader("E:\\java hefshine\\FileHandling\\file2.txt")); 
          
        line = br.readLine(); 
          
        // loop to copy each line of  
        // file2.txt to  file3.txt 
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        pw.flush(); 
          
        // closing resources 
        br.close(); 
        pw.close(); 
          
        System.out.println("Merged file1.txt and file2.txt into file3.txt"); 
	}
}


