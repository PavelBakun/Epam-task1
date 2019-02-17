package trening;

public class Exercise_5_1 {

	public static void main(String[] args) {
		int x=123456;
		double sum=0.0, multipl=0.0;
		sum=x%10+(x/10)%10+(x/100)%10+(x/1000)%10+(x/10000)%10+(x/100000)%10;
		System.out.println(sum/6);
		multipl=(x%10)*((x/10)%10)*((x/100)%10)*((x/1000)%10)*((x/10000)%10)*((x/100000)%10);
		System.out.println(Math.pow(multipl, 1.0/6));
	}

}
