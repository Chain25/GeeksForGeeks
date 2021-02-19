package easyQuestion;

import java.util.Scanner;

public class Exactly3Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  number");
		int x = scanner.nextInt();
		
		System.out.println("count ="+exactly3Divisor(x));
	}
	// this function also print the perfect square less than equal to x
	/* here we r going to find count of number which are 
	 * have exactly three divisor 
	 * A no is only have three divisor it is perfect square
	 * as 25 is perfect square it has 1,5,25 as its divisor
	 * 4 has 1,2,4
	 * 9 as 1,3,9
	 * so we are going to find count of those no.
	 * 
	 */
	private static int exactly3Divisor(int x) {
		// TODO Auto-generated method stub
		int count =0;
		int n = (int)Math.sqrt(x);
		System.out.println("Perfect squares :");
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				count++;
				System.out.println(i*i);
			}
		}
		return count;
	}
	private static boolean isPrime(int j) {
		// TODO Auto-generated method stub
		if(j==1) return false;
		for(int i=2;i*i<=j;i++) {
			if(j%i==0) {
				return false;
			}
		}
		return true;
	}

}
