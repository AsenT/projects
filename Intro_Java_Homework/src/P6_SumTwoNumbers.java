import java.util.Scanner;


public class P6_SumTwoNumbers {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		
		System.out.print( "Enter first integer: ");
		firstNum = input.nextInt();
		
		System.out.print( "Enter second integer: ");
		secondNum = input.nextInt();
	
		System.out.printf( "The sum of the integers is: %d\n ", firstNum + secondNum);

	}

}
