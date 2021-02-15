package mathematics;

import java.util.Scanner;

public class TrailingZeroInFactorialOptimzed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("enter num");
		int num = scanner.nextInt();
		
		trailingZero(num);
		
	}

	private static void trailingZero(int num) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=5;i<= num;i=i*5) {
			
			res = res + num/5;
		}
		System.out.println("trailing zero are : "+res);
	}

}
