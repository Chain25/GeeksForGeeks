package mathematics;

import java.util.Scanner;

public class PowerCountEffective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number :");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		long result = computePower(x,y);
		System.out.println(x+" raise to " + y+ " = "+result);
	}

	private static long computePower(int x, int y) {
		// TODO Auto-generated method stub
		if(y==0)return 1;
		if(y==1)return x;
		
		if(y % 2 ==0)
			return computePower(x,y/2)*computePower(x,y/2);
		else 
			return computePower(x,y-1)*x;
		
	}

}
