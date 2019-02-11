package task1;

public class Exercise_4_1 {
	public static void main(String[] args) {
		int[] dec = new int[4];
		int count = 0;
		boolean flag=true;
		// Enter number
		int number = 9876;
		if ((number < 999) || (number > 9999)) {
			System.out.println ("Incorrect Number");
		} else {
			
			while ((flag)&&(count<dec.length)){
				dec[count]=number%10;
				number/=10;
				//compare element of massive
				if (count==0) {
					count++;
				} else if (dec[count]>dec[count-1]) {
					count++;
				} else  flag=false;
			}//close while 
			
			if (count==dec.length) {
				System.out.println("Decrease");
			} else 	System.out.println("Doesn't decrease");
			
		}
		
	}//close main
}//close class