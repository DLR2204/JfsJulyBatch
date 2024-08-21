package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\project.txt");
		
		fw.write(1234);
		
		fw.write("apple");
		
		fw.write('c');
		
//		fw.write(3.14f);
//		
//		fw.write(true);
//		
		char ch[] = {'s','d','f'};
		
		fw.write(ch);
		
		fw.flush();
		
		System.out.println("data is written into the file successfully");
	}
	
	//it will not allows boolean,float values
	
	//it will not process int values
}
