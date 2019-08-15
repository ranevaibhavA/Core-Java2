package IO_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1.Write a program to read contents from file and store reverse contents in another file.
public class Read_Reverse_1st {

	public static void main(String[] args) throws Exception  {
//File f1=new File("E:\\java hefshine\\FileHandling\\ReadReverseFile.txt");
		FileInputStream fInput = new FileInputStream("E:\\java hefshine\\FileHandling\\ReadReverseFile.txt");
		
		 FileWriter fw  = new FileWriter("E:\\java hefshine\\FileHandling\\ReverseNew.txt");
		 
	       int k,p=0;
	       char ch=' ';
	      
	       char c[]=new char[fInput.available()];
	       
	        while((k=fInput.read())!=-1)
	        {
	        	ch=(char) k;
	        	c[p]=ch;
	        	System.out.print(c[p]); 
	        	p++;
	       }
	        
	       
	       System.out.println();
	        for(int j=c.length-1;j>=0;j--)
	        {
	        	fw.write(c[j]);
	        	fw.flush();
	        }
	      
		
	}

}
