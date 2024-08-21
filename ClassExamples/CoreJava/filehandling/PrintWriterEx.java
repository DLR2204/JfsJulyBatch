package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\project.txt");
		
		
		pw.println(true);
		
		pw.println(1234);
		
		pw.println("string");
		
		pw.println('c');
		
		char[] ch = {'d','e','h'};
		
		pw.println(ch);
		
		pw.flush();
		
		System.out.println("data is written into the file successfully");
		
		
	}

}
