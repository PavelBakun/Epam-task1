package task1;

public class Exercise_6 {
	public static void main(String[] args) {
		int[] dec = new int[7];
		// Enter number
		int number = 1234567;
		if ((number < 999999) || (number > 9999999)) {
			System.out.println ("Incorrect Number");
		} else {
			
			for (int i=0; i<dec.length; i++){
				dec[i]=number%10;
				number/=10;
			}
			number=0;
			for (int i=0; i<dec.length; i++) {
				number=number*10+dec[i];
							}
			System.out.println(number);
			
		}

	}

}
