package homeworks;

public class hw_0202_gcm {
	/**
	 * Наибольший общий делитель
	 */
	public static void main(String[] args) {
		gcd(130,0);
	}

	private static void gcd(int a, int b) {

		if (a > 0 && b > 0) {

			System.out.println("Your input: a = " + a + ", b = " + b);

			while (a!=0&&b!=0) {
				if (a < b) {
					a = b + a;
					b = a - b;
					a = a - b;
				}
				a = a%b;
				System.out.println(a +" "+ b);
			}			
			System.out.println("==================\nGreatest Common Divisor = "+ (a + b));

		} else {
			System.out.println("Incorrect data.\nCheck your input.\nUse a, b > 0");
		}
	}
}
