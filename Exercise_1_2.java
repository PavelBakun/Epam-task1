package task1;

import java.util.Scanner;

public class Exercise_1_2 {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner scanNumber = new Scanner(System.in);
		System.out.println("Enter three number: ");
		a = scanNumber.nextInt();
		b = scanNumber.nextInt();
		c = scanNumber.nextInt();
		scanNumber.close();
		
		if ((a == b) && (b == c)) {
			System.out.println("All numbers are equal");
		} else if ((a != b) && (b != c) && (a != c)) {
			System.out.println("All numbers are different");
		} else {
			System.out.println("Some numbers are equal");
		}
		
	}

}
