package task1;

import java.util.Scanner;

public class Exercise_2_2 {
	public static void main(String[] args) {
		
		int weight_KG;
		System.out.println("Enter weight dinosaur in kg: ");
		Scanner scanWeight = new Scanner(System.in);
		weight_KG = scanWeight.nextInt();
		scanWeight.close();
		 
		long weight_G = 1000 * weight_KG;
		long weight_MG = 1000 * weight_G;
		double weight_T = (double) weight_KG / 1000;
		
		System.out.println("weight_KG = " + weight_KG + "\n"
				+ "weight_G = " + weight_G + "\n"
				+ "weight_MG = " + weight_MG + "\n"
				+ "weight_T = " + weight_T);
	} //close main
}//close class
