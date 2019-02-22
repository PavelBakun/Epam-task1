package task1;

import java.util.Scanner;

public class Exercise_5_2 {

	public static void main(String[] args) {
		
		int number;
		Scanner scanNumber = new Scanner(System.in);
		do {System.out.println("Enter the six digits number:");
		number = scanNumber.nextInt();
		} while (number < 99999 || number > 999999);
		scanNumber.close();
		
		double sum = 0;
		double multipl = 1.0;
		while (number > 0) {
			sum += number % 10;
			multipl *= number % 10;
			number /= 10;
		}//close while
		
		System.out.println("arithmetical mean = "+ sum/6 + "\n" 
				+ " geometric mean = " + Math.pow(multipl, 1.0/6));
		
	}//close main
	
}//close class
