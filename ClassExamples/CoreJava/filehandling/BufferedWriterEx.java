package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\project.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(1234);

		bw.write(1234);

		bw.write("apple");

		bw.write('c');
		
		char[] ch = {'s','f','r'};
		
		bw.write(ch);
		
		
		bw.flush();
		
		System.out.println("file is written successfully");

	}
	
	//it will not allows boolean,float values
	
	//it will not process int values

}
