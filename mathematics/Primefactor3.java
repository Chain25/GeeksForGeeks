package mathematics;

import java.util.Scanner;

public class Primefactor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		primeFactor(val);
	}

	private static void primeFactor(int val) {
		// TODO Auto-generated method stub
		if(val <= 1) return ;
		while(val % 2 ==0 ) {
			System.out.println(2);
			val /= 2;
		}
		while( val % 3 == 0) {
			System.out.println(3);val /= 3;
		}
		for(int i=5;i*i<=val;i+=6) {
			
			while(val % i == 0) {
				
				System.out.println(i);
				val /= i;
				
			}
			while(val % (i+2) == 0) {
				
				System.out.println(i);
				val /= i;
				
			}
		}
		if(val > 1)System.out.println(val);
	}

}
