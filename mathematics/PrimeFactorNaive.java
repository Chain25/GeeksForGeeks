package mathematics;

import java.util.Scanner;

public class PrimeFactorNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		primeFactor(num);
	}

	private static void primeFactor(int num) {
		// TODO Auto-generated method stub
		for(int i = 2;i<num;i++) {
			
			
			if(isPrime(i)) {
				int x =i;
				while(num % x ==0) {
					System.out.println(i);
					x = x *i;
				}
			}
			
			
		}
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		if(i == 1) return false;
		if(i ==2 || i ==3) return true;
		if( i % 2 == 0 || i%3 == 0) return false;
		for(int j=5;j*j<=i;j+=6) {
			if(i % j == 0 || i%(j+2) ==0)return false;
		}
		return true;
	}

}
