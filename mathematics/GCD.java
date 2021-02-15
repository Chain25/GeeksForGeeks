package mathematics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("enter num two number :");
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int min = Math.min(num, num2);
		
		while(min > 0) {
			if((num % min ==0)&& (num2 % min == 0))
				break;
			min--;
		}
		System.out.println("gcd of "+num+","+ num2+" is "+min);

	}

}
