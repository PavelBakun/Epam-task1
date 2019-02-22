package task1;

import java.util.Scanner;

public class Exercise_6_2 {

	public static void main(String[] args) {
		
		int number;
		Scanner scanNumber = new Scanner(System.in);
		do {System.out.println("Enter the seven digits number: ");
		number = scanNumber.nextInt();
		} while (number < 999999 || number > 9999999);
		scanNumber.close();
		
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		}//close while
		
		System.out.println("ReverseNumber = " + reverseNumber);
		
	} //close main
	
}//close class
