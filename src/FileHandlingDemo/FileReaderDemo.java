package FileHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. File reader is capable of reading only one character at a time
		 * 2. It reads the characters and return the ASCII value of the same
		 */
		String filePath;
		filePath = "./src/FileHandlingDemo/TestData";
		
		FileReader reader = new FileReader(filePath);
		//System.out.println((char)reader.read());
		int i;
		while ((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		reader.close();
		
		FileWriter writer = new FileWriter(filePath);
		writer.write("Hello World");
		writer.close();
		System.out.println("Finished Writing");
		
	}
}
