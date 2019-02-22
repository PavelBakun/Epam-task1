package task1;

import java.util.Scanner;

public class Exercise_7_2 {

	public static void main(String[] args) {
		
		int numberA, numberB;
		Scanner scanNumber = new Scanner(System.in);
		System.out.println("Enter two numbers a and b: ");
		numberA = scanNumber.nextInt();
		numberB = scanNumber.nextInt();
		scanNumber.close();

		numberA = numberA ^ numberB; 
		numberB = numberA ^ numberB;
		numberA = numberA ^ numberB;
		
		System.out.println("numberA = " + numberA + "\n" 
				+ " numberB = " + numberB);
	}

}
