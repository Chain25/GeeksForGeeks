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

	private static void divisorOf(int val) {
		// TODO Auto-generated method stub
		for(int i=1;i*i <= val ;i++) {
			if(val % i == 0) {
				System.out.println(i);
				System.out.println(val/i);
			}
		}
	}

}
