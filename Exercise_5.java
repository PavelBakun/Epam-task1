package task1;

public class Exercise_5 {
	public static void main(String[] args) {
		int[] dec = new int[6];
		// Enter number
		int number = 111111;
		double sum=0;
		double multipl=1.0;
		if ((number < 99999) || (number > 999999)) {
			System.out.println ("Incorrect Number");
		} else {
			
			for (int i=0; i<dec.length; i++){
				dec[i]=number%10;
				number/=10;
				sum+=dec[i];
				multipl*=dec[i];
			}
			
			sum=sum/dec.length;
			System.out.println("arithmetical mean= "+sum);
			multipl=Math.pow(multipl, 1.0/ dec.length);
			System.out.println("geometric mean= "+multipl);
			
		}

	}

}
