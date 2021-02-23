package io_package;
import java.io.IOException;
public class ReadBytes {

	public static void main(String[] args) 
	throws IOException{
		// TODO Auto-generated method stub
		byte data[] = new byte[10];
		System.out.println("Enter some character ");
		System.in.read(data);
		System.out.println("you entered :");
		for(byte val : data) {
			
			System.out.println((char)val);
		}
		
		// demonstrate the System.out.write();
		
		int x = 'X';
		System.out.write(x);
		
		System.out.write(data);
	}

}
