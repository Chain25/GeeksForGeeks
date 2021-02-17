package mathematics;

import java.util.Scanner;

public class DivisorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int val = scanner.nextInt();
		divisorOf(val);
	}

	
	// this below method don't print in sorting order so another approach but same time complexity
//	private static void divisorOf(int val) {
//		// TODO Auto-generated method stub
//		for(int i=1;i*i <= val ;i++) {
//			if(val % i == 0) {
//				System.out.println(i);
//				if(i != val/i)
//					System.out.println(val/i);
//				//System.out.println(val/i);
//				
//			}
//		}
//	}
	
	private static void divisorOf(int val) {
		for(int i=1 ;i*i< val ;i++) {
			if(val %i == 0)
				System.out.println(i);
		}
		for(int i =(int) Math.sqrt(val) ; i<=val ;i++) {
			if(val %i == 0)
				System.out.println(i);
			
		}
	}
}
