package mathematics;
import java.util.Scanner;
public class FactorialIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		int val = scanner.nextInt();
		int result = factorial(val);
		System.out.println("Factorial of number "+ val + " = "+result);
		
	}

	private static int factorial(int val) {
		// TODO Auto-generated method stub
		if(val == 1) {
			return 1;
		}
		
		return val*factorial(val-1);
	}

}
