package mathematics;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number :");
		int val = scanner.nextInt();
		
		sieveOfEratosthenes(val);
	}

	private static void sieveOfEratosthenes(int val) {
		// TODO Auto-generated method stub
		int[] arr = new int[val+1];
		boolean[] isPrime = new boolean[val+1];
		isPrime[0]= true;
		isPrime[1] = true;
		for(int i=2;i<=val ;i++) {
			if(!isPrime[i]) {
				
				for(int j=i*2;i<arr.length;j=j+i) {
					arr[j]=-1;
				}
			}
				
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}
	}

	
}
