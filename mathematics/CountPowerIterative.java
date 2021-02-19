package mathematics;

import java.util.Scanner;

public class CountPowerIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number");
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		iterativePower(x,n);
		System.out.println(Math.abs(-32));
		
	}

	private static void iterativePower(int x, int n) {
		// TODO Auto-generated method stub
		int res =1;
		while(n>0) {
			
			if(n%2 != 0) 
				res = res *x;
			
			x = x*x;
			
			
			
		}
		
		
		
	}

}
