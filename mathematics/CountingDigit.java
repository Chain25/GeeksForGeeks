package mathematics;

import java.util.Scanner;

public class CountingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num");
		int num = scanner.nextInt();
		CountingDigit cd = new CountingDigit();
		cd.countDigit(num);

	}
	public void countDigit(int num) {
		int count=0,val = num;
		
		while(num != 0) {
			num/=10;
			count++;
		}
		System.out.println("Number of digit in "+val+ " is "+count);
	}

}
