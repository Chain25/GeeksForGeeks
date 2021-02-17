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
		arr[0] =-1;
		arr[1] =-1;
		for(int i=2;i<=val ;i++) {
			if(arr[i] != -1)
				crossOut(i,arr);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}
	}

	private static void crossOut(int i,int[] arr) {
		// TODO Auto-generated method stub
		int x=i;
		for(i=i*2;i<arr.length;i+=x) {
			arr[i]=-1;
		}
	}

}
