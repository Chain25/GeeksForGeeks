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
			for(int i=2;i*i<=val;i++) {
				
				if(isPrime(i)) {
					int x =i;
					while(val %x ==0) {
						System.out.println(i);
						x*=i;
					}
				}
				
				
			}
		}

		private static boolean isPrime(int i) {
			// TODO Auto-generated method stub
			if(i ==1)return false;
			if(i==2|| i==3) return true;
			if(i%2 ==0|| i%3==0) return false;
			for(int j=5;j*j<=i;j+=6) {
				if(i%j ==0 || i%(j+2) ==0)return false;
				
			}
			return true;
		}
}