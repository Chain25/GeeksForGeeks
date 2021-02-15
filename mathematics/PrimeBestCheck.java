package mathematics;

import java.util.Scanner;

public class PrimeBestCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int val = scanner.nextInt();
		boolean result = isPrime(val);
		System.out.println(result);
	}

	private static boolean isPrime(int val) {
		// TODO Auto-generated method stub
		if(val == 1)return false;
		if(val ==2 || val ==3) return true;
		for(int i=5;i*i<=val;i=i+6) {
			
			if(val % i == 0 || val % (i+2) == 0) return false;
		}
		return true;
	}

}
