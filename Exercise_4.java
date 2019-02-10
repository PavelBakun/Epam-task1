package task1;

public class Exercise_4 {
	public static void main(String[] args) {
		int[] dec = new int[4];
		int count = 0;
		// Enter number
		int number = 9642;
		if ((number < 999) || (number > 9999)) {
			System.out.println ("Incorrect Number");
		} else {
			
			for (int i=0; i<dec.length; i++){
				dec[i]=number%10;
				number/=10;
				//compare element of massive
				if ((i>0)&&(dec[i]>dec[i-1])) {
					count++;
				} 
				if ((i>0)&&(dec[i]<dec[i-1])) {
					count--;
				} 
				
			}//close for 
			if (count==3) {
				System.out.println("Decrease");
			} else 	if (count==-3) {
				System.out.println("Increase");
			} else System.out.println("Dosn't decrease and dosn't increase");
			
		}
		
	}
}


