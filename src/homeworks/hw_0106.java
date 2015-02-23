package homeworks;

public class hw_0106 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i=2; i <=20; i++){
			double step = Math.pow(i, 5);
			System.out.println("Step = " + step);
			double root = Math.pow(step, 0.2);
			System.out.println("root = " + root);			
		}		
		
	}

}
