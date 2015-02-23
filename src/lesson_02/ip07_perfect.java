package lesson_02;
import java.util.Arrays;


public class ip07_perfect {

	public static void main(String[] args) {
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (isPerfect(i)){
				System.out.println(i + ": "+ isPerfect(i));
				System.out.println(Arrays.toString(divisors(i)));
				System.out.println("Search:");
			}
		}
		//		System.out.println(isPerfect(6));
		//		System.out.println(isPerfect(28));
		//		System.out.println(Arrays.toString(divisors(36)));

	}
	static boolean isPerfect(int x){
		int sum = 0;		
		for (int i = 1; i < x; i++) {
		
			if (x%i == 0){
				sum = i + sum;				
			}			

		}		
		return (sum == x);
	}
	static int[] divisors(int x){
		int c = 0;
		for (int i = 1; i <= x; i++) {
			if (x%i == 0){
				c++;				
			}
		}
		int []res = new int[c];
		for (int i = 1,j=0; i <= x; i++) {
			if (x%i == 0){
				res[j]= i;
				j++;
			}
		}		


		return res;	

	}

}
