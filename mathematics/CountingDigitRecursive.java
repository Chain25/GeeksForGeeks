package mathematics;

import java.util.Scanner;

public class CountingDigitRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this is recursive approach forr solving counting digit in a number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num");
		int num = scanner.nextInt();
		System.out.println("this is recursive approach");
		int val = countDigit(num);
		System.out.println("Number of digit in "+num+ " is "+val);
	}

	private static int countDigit(int num) {
		// TODO Auto-generated method stub
		if(num ==0) {
			return 0;
		}
		
		return 1+ countDigit(num/10);
	}

}
