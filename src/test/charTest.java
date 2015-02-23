package test;

import java.util.Random;

public class charTest {

	public static void main(String[] args) {
		
		System.out.println("PI is equal to " + Math.PI);
		System.out.println("e is equal to " + Math.E);
		System.out.println("Random is " + Math.random());
		double min = Math.random(),max = Math.random();
//		int i_max = Integer.MAX_VALUE;
		int i_max = 100;
		for (int i = 0; i < i_max; i++) {
			Random rand = new Random();
			if (min > rand.nextDouble())
				min = rand.nextDouble();
			if(max<rand.nextDouble())
				max=rand.nextDouble();
			System.out.println("MAX: " + max);
			System.out.println("MIN: " + min);
			
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);

	}

}
