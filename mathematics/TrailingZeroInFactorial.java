package mathematics;

import java.util.Scanner;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int val = scanner.nextInt();
		trailingZero(val);
		
	}

	private static void trailingZero(int val) {
		// TODO Auto-generated method stub
		float result =1;
		for(int i = val ;i>1;i--) {
			result =result* i;
		}
		System.out.println("Factorial of number "+ val + " = "+result);
		int count =0;
		while(result % 10 == 0) {
			count++;
			result /= 10;
		}
		System.out.println("trailing zero "+ count);
	}

}
