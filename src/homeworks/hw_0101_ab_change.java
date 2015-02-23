package homeworks;

public class hw_0101_ab_change {
	
	public static void switchVar (int a, int b){

		System.out.println("a: " + a + ", b: " + b);

		a = b + a;
		b = a - b;
		a = a - b;
		
		System.out.println("a: " + a + ", b: " + b);
	
	}

	public static void main(String[] args) {
		
		int a = 3;
		int b = 12;
			
		switchVar(a, b);
	}

}
