package mathematics;

import java.util.Scanner;

public class PrimeEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		boolean result = isPrime(num);
		System.out.println(result);
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num ==1) {
			return false;
		}
		for(int i=2;i<= Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
