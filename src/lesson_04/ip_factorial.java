package lesson_04;

public class ip_factorial {

	public static void main(String[] args) {		
		System.out.println(factor(16));	
	}
	
	static int factor(int n) {
		if (n == 1)
			return 1;		
		else {
			return n*factor(n-1);
		}
	}
}
