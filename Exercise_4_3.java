package task1;

import java.util.Scanner;

public class Exercise_4_3 {

	public static void main(String[] args) {
		
		int number;
		Scanner scanNumber = new Scanner(System.in);
		do {
			System.out.println("Enter four digits number");
			number = scanNumber.nextInt();
		} while ((number < 999) || (number > 9999));
		scanNumber.close();
	
		int tempNum = number % 10;
		number /= 10;
		int count = 0;
		while (number > 0) {
			if ((number % 10) > tempNum) {
				count++;
			} else if ((number % 10) < tempNum) {
				count--;
			} //close if
			number /= 10; 
		}//close while
		
		if (count == 3) {
						System.out.println("Decrease sequance");
		} else if (count == -3) {
						System.out.println("Increase sequance");
		} else {
			System.out.println("No sequance");
		} //close if
	
	} //close main

} //close class
