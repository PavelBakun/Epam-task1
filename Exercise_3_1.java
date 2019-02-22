package task1;

import java.util.Scanner;

public class Exercise_3_1 {
	public static void main(String[] args) {
		
		double r1, r2;
		Scanner scanRadius = new Scanner(System.in);
		do {
			System.out.println("Enter first radius: ");
			r1 = scanRadius.nextDouble();
			System.out.println("Enter second radius: ");
			r2 = scanRadius.nextDouble();
			if (r1 < r2) {
				System.out.println("The first radius must be bigger then second");
			}
		} while (r1 < r2);
		scanRadius.close();
		
		double s;
		s = Math.PI * ( r1 * r1 - r2 * r2);
		System.out.printf("s = %.2f", s);
		
	} //close main
} //close class