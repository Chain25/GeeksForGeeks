package mathematics;

import java.util.Scanner;

public class PrimeFactorEfficient {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int val = scanner.nextInt();
			primeFactor(val);
		}

		private static void primeFactor(int val) {
			// TODO Auto-generated method stub
			if(val <= 1) return ;
			for(int i=2;i*i<=val;i++) {
				
				while(val % i == 0) {
					
					System.out.println(i);
					val /= i;
					
				}
			}
			if(val > 1)System.out.println(val);
		}

//		private static boolean isPrime(int i) {
//			// TODO Auto-generated method stub
//			if(i ==1)return false;
//			if(i==2|| i==3) return true;
//			if(i%2 ==0|| i%3==0) return false;
//			for(int j=5;j*j<=i;j+=6) {
//				if(i%j ==0 || i%(j+2) ==0)return false;
//				
//			}
//			return true;
//		}
}