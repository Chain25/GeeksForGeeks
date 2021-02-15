package mathematics;

import java.util.Scanner;

public class GCDEuclidean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number :");
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		gcd_euclidean(num,num2);
		
	}

	private static void gcd_euclidean(int a , int b) {
		// TODO Auto-generated method stub
		while(a != b) {
			
			if( a >b)
				a = a -b;
			else 
				b = b-a;
			
			
		}
		System.out.println("GCD of two number = "+a);
	}

}
