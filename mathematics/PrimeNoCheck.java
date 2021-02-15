package mathematics;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		checkPrimeOrNot(val);
	}

	private static void checkPrimeOrNot(int val) {
		// TODO Auto-generated method stub
		for(int i=2;i<val;i++) {
			if(val % i ==0) {
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("prime");
		
	}

}
