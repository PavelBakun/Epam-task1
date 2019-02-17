package trening;

public class Exercise_6_1 {
	public static void main(String[] args) {
		int x=7025023;
		int reverseX;
		reverseX=(x%10)*1000000+
				((x/10)%10)*100000+
				((x/100)%10)*10000+
				((x/1000)%10)*1000+
				((x/10000)%10)*100+
				((x/100000)%10)*10+
				x/1000000;
		System.out.println(reverseX);
	}

}
