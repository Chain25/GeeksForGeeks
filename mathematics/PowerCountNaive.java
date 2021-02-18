package mathematics;

import java.util.Scanner;

public class PowerCountNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number :");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		computePower(x,y);
	}

	private static void computePower(int x, int y) {
		// TODO Auto-generated method stub
		long result =1;
		for(int i=1;i<=y;i++) {
			result = result *x;
		}
		System.out.println(x+" raise to " + y+ " = "+result);
	}

}
