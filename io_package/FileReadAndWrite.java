package io_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * to use this program, specify the name of the file
 * that you want to see
 * eg . to see a file called abc.txt
 * use the following command
 * 
 * java FileReadAndWrite abc.txt
 * 
 */


public class FileReadAndWrite {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream file;
		int i ; 
		try {
			file = new FileInputStream("ItsMe.txt");
				
		}catch(FileNotFoundException exc) {
			System.out.println("File not found exception");
			return ;
		}
		
		try {
			// read until End of FIle encountered
			do {
				
				i = file.read(); // read from file
				if(i != -1) System.out.println((char) i);
				
				
			}while(i != -1); // when i ==1 ,the end of the file has been reached
		}catch(IOException exc) {
			System.out.println("Error reading file");
		}
		
		try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}