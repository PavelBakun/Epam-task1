package task1;

public class Exercise_2 {
	public static void main(String[] args) {
		int weight_KG=25000;
		
		long weight_G=1000*weight_KG;
		long weight_MG=1000*weight_G;
		double weight_T=weight_KG/1000;
		
		System.out.println("weight_KG= "+weight_KG);
		System.out.println("weight_G= "+weight_G);
		System.out.println("weight_MG= "+weight_MG);
		System.out.println("weight_T= "+weight_T);

	}

}
