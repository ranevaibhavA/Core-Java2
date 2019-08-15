package IO_FileHandling;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		File obj = new File("E:\\java hefshine\\FileHandling\\testingyy.txt");
	    if (obj.exists()) {
	      System.out.println("File name: " + obj.getName()); 
	      System.out.println("Absolute path: " + obj.getAbsolutePath()); 
	      System.out.println("Writeable: " + obj.canWrite()); 
	      System.out.println("Readable " + obj.canRead()); 
	      System.out.println("File size in bytes " + obj.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	    

	}

}
