package mathematics;
import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num");
		
		int num = scanner.nextInt();
		boolean bool =  checkPalindrome(num);
		if(bool)
			System.out.println("Palindrome");
		else System.out.println("Not palindrome");
				
	}

	private static boolean checkPalindrome(int num) {
		// TODO Auto-generated method stub
		int sum=0,val = num;
		while(num != 0) {
			sum = sum*10 + num%10;
			num /= 10;
		}
		if(sum == val) {
			return true;
		}else
		 return false;
	}

}
