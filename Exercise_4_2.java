package trening;

public class Exercise_4_2 {
	public static void main(String[] args) {
		int x=7654;
		if (((x%10)>((x/10)%10))&& (((x/10)%10))>((x/100)%10)){
			System.out.println("Increase");
		} else {
			System.out.println("Doesn't increase");
		}
		

	}

}
