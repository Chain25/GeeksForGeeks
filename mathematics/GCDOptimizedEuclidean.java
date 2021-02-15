package mathematics;

import java.util.Scanner;

public class GCDOptimizedEuclidean {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number :");
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = gcd_euclidean(num,num2);
		System.out.println(result);
	}

	private static int gcd_euclidean(int num, int num2) {
		// TODO Auto-generated method stub
		if(num2  == 0) {
			return num;
		}
		else 
			return gcd_euclidean(num2, num %num2);
	}
}
