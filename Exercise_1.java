package task1;

public class Exercise_1 {

	public static void main(String[] args) {
		int a=3;
		int b=3;
		int c=3;
		
		if ((a==b) && (b==c)) {
			System.out.println("All numbers are equal");
		} else if ((a!=b)&&(b!=c)&&(a!=c)) {
			System.out.println("All numbers are different");
		} else System.out.println("Some numbers are equal");
		
		
	}

}
